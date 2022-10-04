package com.kidswordstudio.cm;

import com.kidswordstudio.cm.model.Tabuleiro;

public class Aplicacao {
	public static void main(String[] args) {
		var tabuleiro = new Tabuleiro(3, 3, 9);
		System.out.println("Carregou o tabuleiro");
		tabuleiro.open(2, 2);
		//new TabuleiroConsole(tabuleiro);


	}

}
