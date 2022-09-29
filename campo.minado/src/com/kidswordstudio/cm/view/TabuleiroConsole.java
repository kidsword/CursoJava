package com.kidswordstudio.cm.view;

import java.util.Scanner;

import com.kidswordstudio.cm.exception.SairException;
import com.kidswordstudio.cm.model.Tabuleiro;

public class TabuleiroConsole {
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
		executeGame();
	}

	private void executeGame() {
		try {
			var continuar = true;
			while (continuar) {
				System.out.println("Iniciar uma partida? (S/n) ");
				var resposta = entrada.nextLine();

				if ("n".equalsIgnoreCase(resposta))
					continuar = false;
				else
					tabuleiro.restart();

			}
		} catch (SairException e) {
			System.out.println("Tchau!!!");
		} finally {
			entrada.close();
		}

	}

}
