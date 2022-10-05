package com.kidswordstudio.calc.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {
	public Botao(String texto, Color cor) {
		setText(texto);
		setBackground(cor);
		setOpaque(true);	
		setFont(new Font("courier", Font.PLAIN, 20));
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

}
