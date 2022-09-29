package com.kidswordstudio.cm.view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import com.kidswordstudio.cm.exception.ExplosaoException;
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
				gameCicle();
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

	private void gameCicle() {
		try {
			while(!tabuleiro.goalAchieved()) {
				System.out.println(tabuleiro);
				String digitado = getNewValue("Digite (x, y): ");
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
						.map(e-> Integer.parseInt(e.trim())).iterator();
				
				digitado = getNewValue("1 - Abrir ou 2- marcar: ");
				var x = xy.next() -1;
				var y = xy.next() -1;
				
				if("1".equals(digitado))
					tabuleiro.open(x, y);
				else
					tabuleiro.turnmark(x, y);		
				
			}
			System.out.println("Você ganhou!!!");
		} catch (ExplosaoException e) {
			System.out.println("Você perdeu!!!");
		}
		finally {
			System.out.println(tabuleiro);
		}
	}
	private String getNewValue(String text) {
		System.out.println(text);
		String digitado = entrada.nextLine();
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;			
	}

}
