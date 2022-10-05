package com.kidswordstudio.cm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {
	

	
	private int linhas;
	private int colunas;
	private int minas;

	private final List<Campo> campos = new ArrayList<>();
	private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();
	

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Tabuleiro(int linhas, int colunas, int minas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		generateFields();
		associateNeighborhood();
		sortMines();
	}
	
	public void paraCada(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}
	
	public void registerObserver(Consumer<ResultadoEvento> obs) {
		observadores.add(obs);
	}
	
	public void notifyObservers(boolean result) {
		observadores.stream().forEach(o-> o.accept(new ResultadoEvento(result)));
	}

	private void generateFields() {
		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				var campo = new Campo(l, c);
				campo.registerObs(this);
				campos.add(campo);
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
		Predicate<Campo> mined = c -> c.isMined();

		do {
			var rndPosition = new Random().nextInt(0, campos.size());
			//var rndPosition = (int)(Math.random() * campos.size());
			//System.out.printf("\rMinas: %s - nova: %d", campos.toString(), rndPosition);
			campos.get(rndPosition).toMine();
			armedMines = campos.stream().filter(mined).count();

		} while (armedMines < minas);
	}

	public boolean goalAchieved() {
		return campos.stream().allMatch(c -> c.goalAchieved());
	}

	public void restart() {
		campos.stream().forEach(c -> c.restart());
		sortMines();
	}

	public void open(int line, int column) {
		try {
			campos.parallelStream().filter(lineColumnField(line, column)).findFirst().ifPresent(c -> c.open());
		} catch (Exception e) {
			//FIXME Trocar o tratamento
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}

	public void turnmark(int line, int column) {
		campos.parallelStream().filter(lineColumnField(line, column)).findFirst().ifPresent(c -> c.turnMark());
	}

	Predicate<Campo> lineColumnField(int line, int column) {
		return c -> c.getLinha() == line && c.getColuna() == column;
	}

	public String toString() {

		var sb = new StringBuilder();
		var i = 0;

		do {
			sb.append(String.format(" %s ", i > 0 ? i : ""));
			i++;
		} while (i <= colunas);
		
		sb.append("\n");		

		i = 0;
		for (int l = 0; l < linhas; l++) {
			sb.append(String.format("%s ", l + 1));
			for (int c = 0; c < colunas; c++) {
				sb.append(String.format(" %s ", campos.get(i)));
				i++;
			}
			sb.append("\n");
		}

		return sb.toString();
	}
	
	@Override
	public void eventoOcorreu(Campo c, CampoEvento e) {
		if(e == CampoEvento.Explodir) {
			System.out.println("Perdeu...");
			showMines();
			this.notifyObservers(false);			
		}
		else if(goalAchieved()) {
			System.out.println("Ganhou...");
			this.notifyObservers(true);
		}
	}
	void showMines() {
		campos.stream()
		.filter(c->c.isMined())
		.filter(c->!c.isMarcado())
		.forEach(c->c.setAberto(true));
		
	}
}
