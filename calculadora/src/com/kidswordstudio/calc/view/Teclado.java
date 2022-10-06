package com.kidswordstudio.calc.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.kidsword.calc.model.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel  implements ActionListener{

	private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
	private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);

	public Teclado() {
		// oldKeyboardSet();
		keyBoardSet();
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			var botao = (JButton)e.getSource();
			Memoria.getInstacia().processarComando(botao.getText());
			
		}
	}

	private void keyBoardSet() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(layout);
		
		c.weightx = 1;
		c.weighty =1;
		c.fill = GridBagConstraints.BOTH;
		
		addButton("AC", COR_CINZA_ESCURO,0,0,2,c);
		addButton("±", COR_CINZA_ESCURO,2,0,c);
		addButton("/", COR_LARANJA,3,0,c);
		// SEGUNDA LINHA
		addButton("7", COR_CINZA_CLARO,0,1,c);
		addButton("8", COR_CINZA_CLARO,1,1,c);
		addButton("9", COR_CINZA_CLARO,2,1,c);
		addButton("*", COR_LARANJA,3,1,c);
		// TERCEIRA LINHA
		addButton("4", COR_CINZA_CLARO,0,2,c);
		addButton("5", COR_CINZA_CLARO,1,2,c);
		addButton("6", COR_CINZA_CLARO,2,2,c);
		addButton("-", COR_LARANJA,3,2,c);
		// QUARTA LINHA
		addButton("1", COR_CINZA_CLARO,0,3,c);
		addButton("2", COR_CINZA_CLARO,1,3,c);
		addButton("3", COR_CINZA_CLARO,2,3,c);
		addButton("+", COR_LARANJA,3,3,c);
		// QUINTA LINHA
		addButton("0", COR_CINZA_CLARO,0,4,2,c);
		addButton(",", COR_CINZA_CLARO,2,4,c);
		addButton("=", COR_LARANJA,3,4,c);

	}
	
	private void addButton(String texto, Color cor, int x, int y, GridBagConstraints c) {
		var botao = new Botao(texto, cor);
		c.gridx = x;
		c.gridy = y;
		botao.addActionListener(this);
		add(botao, c);		
	}
	private void addButton(String texto, Color cor, int x, int y, int width, GridBagConstraints c) {
		c.gridwidth = width;
		var botao = new Botao(texto, cor);		
		addButton(texto, cor, x,y,c);
		c.gridwidth = 1;
	}
	

	private void oldKeyboardSet() {
		setLayout(new GridLayout(5, 4));
		// PRIMEIRA LINHA
		add(new Botao("AC", COR_CINZA_ESCURO));
		add(new Botao("+/-", COR_CINZA_ESCURO));
		add(new Botao("%", COR_CINZA_ESCURO));
		add(new Botao("/", COR_LARANJA));
		// SEGUNDA LINHA
		add(new Botao("7", COR_CINZA_CLARO));
		add(new Botao("8", COR_CINZA_CLARO));
		add(new Botao("9", COR_CINZA_CLARO));
		add(new Botao("*", COR_LARANJA));
		// TERCEIRA LINHA
		add(new Botao("4", COR_CINZA_CLARO));
		add(new Botao("5", COR_CINZA_CLARO));
		add(new Botao("6", COR_CINZA_CLARO));
		add(new Botao("-", COR_LARANJA));
		// QUARTA LINHA
		add(new Botao("1", COR_CINZA_CLARO));
		add(new Botao("2", COR_CINZA_CLARO));
		add(new Botao("3", COR_CINZA_CLARO));
		add(new Botao("+", COR_LARANJA));
	}
}
