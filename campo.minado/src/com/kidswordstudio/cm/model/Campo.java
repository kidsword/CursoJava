package com.kidswordstudio.cm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.kidswordstudio.cm.exception.ExplosaoException;

/**
 * @author daniel
 *
 */
public class Campo {
	private final int linha;
	private final int coluna;

	private boolean aberto;
	private boolean minado;
	private boolean marcado;

	private List<Campo> vizinhos = new ArrayList<>();

	public Campo(int linha, int coluna) {
		super();
		this.linha = linha;
		this.coluna = coluna;
	}
	
	Predicate<Campo> notMined = v -> !v.minado; 

	public boolean add(Campo vizinho) {
		var linDiff = linha != vizinho.linha;
		var colDiff = coluna != vizinho.coluna;
		var diagonal = linDiff && colDiff;

		int deltaLine = Math.abs(linha - vizinho.linha);
		int deltaColumn = Math.abs(coluna - vizinho.coluna);
		int deltaGeneral = deltaLine + deltaColumn;

		if (deltaGeneral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeneral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else
			return false;
	}

	public boolean add(int line, int col) {
		return this.add(new Campo(line, col));
	}

	/**
	 * 
	 */
	void turnMark() {
		if (!aberto)
			marcado = !marcado;
	}

	boolean open() {
		if (!aberto && !marcado) {
			aberto = true;
			if (minado) {
				throw new ExplosaoException();
			}

			if (this.securityNeighbors()) {
				vizinhos.forEach(v -> v.open());
			}
			else {
				vizinhos.stream().filter(notMined).forEach(v -> v.open());
			}
			return true;
		}

		return false;
	}
	

	boolean securityNeighbors() {
		return vizinhos.stream().noneMatch(notMined);
	}
	
	void restart() {
		aberto = false;
		minado = false;
		marcado = false;
	}

	void toMine() {
		minado = true;
	}

	boolean isMarked() {
		return marcado;
	}

	public boolean isOpened() {
		return aberto;
	}

	public boolean isMined() {
		return minado;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean goalAchieved() {
		var desvendado = !minado && aberto;
		var protegido = minado && marcado;
		return desvendado || protegido;		
	}
	
	long minesOnNeighborhood() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	public String toString(){
		var mines = minesOnNeighborhood();
		if(marcado)
			return "X";
		else if (aberto && minado)
			return "*";
		else if ( aberto &&  mines > 0)
			return Long.toString(mines);
		else if (aberto)
			return " ";
		else
			return "?";		
	}

}
