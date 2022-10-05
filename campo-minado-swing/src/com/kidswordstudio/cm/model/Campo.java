package com.kidswordstudio.cm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
	private List<CampoObservador> observadores = new ArrayList<>();

	public Campo(int linha, int coluna) {
		super();
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void registerObs(CampoObservador obs) {
		observadores.add(obs);
	}
	
	private void notifyObservers(CampoEvento evento) {
		observadores.stream()
			.forEach(o -> o.eventoOcorreu(this, evento ));		
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
		if(aberto)
			notifyObservers(CampoEvento.Abrir);
	}

	public boolean isMarcado() {
		return marcado;
	}

	Predicate<Campo> notMined = v -> v.isMined(); 

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
	public void turnMark() {
		if (!aberto) {
			marcado = !marcado;
			notifyObservers(marcado ? CampoEvento.Marcar : CampoEvento.Desmarcar);
		}
	}

	public boolean open() {
		if (!aberto && !marcado) {
			if (minado) {
				//TODO implementar nova versao *** Exemplo
				//FIXME Erro *** Exemplo
				notifyObservers(CampoEvento.Explodir);
				return true;
			}
			setAberto(true);

			if (this.securityNeighbors()) {
				vizinhos.forEach(v -> v.open());
			}
			/*else {
				vizinhos.stream().filter(notMined).forEach(v -> v.open());
			}*/
			return true;
		}

		return false;
	}
	

	public boolean securityNeighbors() {
		return vizinhos.stream().noneMatch(notMined);
	}
	
	void restart() {
		aberto = false;
		minado = false;
		marcado = false;
		notifyObservers(CampoEvento.Reiniciar);
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
	
	public boolean goalAchieved() {
		var desvendado = !minado && aberto;
		var protegido = minado && marcado;
		return desvendado || protegido;		
	}
	
	public long minesOnNeighborhood() {
		return vizinhos.stream().filter(v -> v.isMined()).count();
	}
	public String toString(){
		var mines = minesOnNeighborhood();
		if(marcado)
			return setColor("X", ConsoleColors.YELLOW);
		else if (aberto && minado)
			return "*";
		else if ( aberto &&  mines > 0)
			return setColor(mines);
		else if (aberto)
			return " ";
		else
			return "?";		
	}
	
	private String setColor(String text, String color) {
		return color + text + ConsoleColors.RESET ; 
	}
	
	private String setColor(long value) {
		var val = Long.toString(value);
		switch((int)value) {
			case 1:
				return setColor(val, ConsoleColors.GREEN);
			case 2:
				return setColor(val, ConsoleColors.YELLOW);
			default:
				return setColor(val, ConsoleColors.RED);
		}		 
	}

}
