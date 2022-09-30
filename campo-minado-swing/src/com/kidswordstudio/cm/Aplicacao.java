package com.kidswordstudio.cm;

import com.kidswordstudio.cm.model.Tabuleiro;

public class Aplicacao {
	public static void main(String[] args) {
		var tabuleiro = new Tabuleiro(6, 6, 6);
		//new TabuleiroConsole(tabuleiro);

		System.out.println(tabuleiro.toString());
	}

}
