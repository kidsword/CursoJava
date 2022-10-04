package com.kidswordstudio.cm.view;

import java.awt.Font;

import javax.swing.JFrame;

import com.kidswordstudio.cm.model.Tabuleiro;

public class TelaPrincipal extends JFrame {
	public TelaPrincipal() {
		
		var tabuleiro = new Tabuleiro(16,30,50);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(690,438);
		
		setLocationRelativeTo(null);
		
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new TelaPrincipal();
		
	}

	
}