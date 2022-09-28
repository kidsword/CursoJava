package com.kidswordstudio.cm.model;

import java.util.ArrayList;
import java.util.List;

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

	public boolean add(Campo vizinho) {
		var linDiff = linha != vizinho.linha;
		var colDiff = coluna != vizinho.coluna;
		var diagonal = linDiff && colDiff;
		
		int deltaLine = Math.abs(linha - vizinho.linha);
		int deltaColumn = Math.abs(coluna - vizinho.coluna);
		int deltaGeneral = deltaLine + deltaColumn;
		
		if(deltaGeneral == 1 && !diagonal)
		{
			vizinhos.add(vizinho);
			return true;
		}
		else if(deltaGeneral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;		
		}
		else
			return false;
		
	}

}
