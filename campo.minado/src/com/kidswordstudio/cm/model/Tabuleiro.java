package com.kidswordstudio.cm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private int minas;

	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		generateFields();
		associateNeighborhood();
		sortMines();
	}

	private void generateFields() {
		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				campos.add(new Campo(l, c));
			}
		}
	}

	private void associateNeighborhood() {
		for (var c1 : campos)
			for (var c2 : campos) {
				c1.add(c2);
			}
	}

	private void sortMines() {
		var armedMines = 0l;
		var totalFields = campos.size();
		Predicate<Campo> mined = c-> c.isMined();

		do {
			armedMines = campos.stream().filter(mined).count();
			//var rndPosition = (int)(Math.random() * campos.size());
			var rndPosition = new Random().nextInt(0, totalFields - 1);
			campos.get(rndPosition).toMine();

		} while (armedMines < minas);
	}
	
	public boolean goalAchieved() {
		return campos.stream().allMatch(c->c.goalAchieved());
	}
	
	public void restart() {
		campos.stream().forEach(c->c.restart());
		sortMines();
	}
	
	public String toString() {
		var sb = new StringBuilder();
		var i = 0;
		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				sb.append(String.format(" %s ", campos.get(i)));
				i++;			
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	
	public void open(int line, int column) {
		campos.parallelStream()
			.filter(lineColumnField(line, column))
			.findFirst()
			.ifPresent(c->c.open());		
	}
	
	public void turnmark(int line, int column) {
		campos.parallelStream()
			.filter(lineColumnField(line, column))
			.findFirst()
			.ifPresent(c->c.turnMark());		
	}
	
	Predicate<Campo> lineColumnField(int line, int column) { 
		return c-> c.getLinha() == line && c.getColuna() == column; 
	}

}
