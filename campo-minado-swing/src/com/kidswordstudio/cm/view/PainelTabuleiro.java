package com.kidswordstudio.cm.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.kidswordstudio.cm.model.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2301504322690154452L;

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

		int total = tabuleiro.getColunas() * tabuleiro.getLinhas();

		tabuleiro.paraCada(c -> add(new BotaoCampo(c)));

		tabuleiro.registerObserver(e -> {

		});

	}

}
