package com.kidswordstudio.cm.view;

import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.kidswordstudio.cm.model.Tabuleiro;

public class PainelTabuleiro extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2301504322690154452L;

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

		int total = tabuleiro.getColunas() * tabuleiro.getLinhas();

		tabuleiro.paraCada(c -> add(new BotaoCampo(c)));

		tabuleiro.registerObserver(e -> {

			SwingUtilities.invokeLater(() -> {
				if (e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou :)");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu :(");
				}
				tabuleiro.restart();
			});

		});

	}

}
