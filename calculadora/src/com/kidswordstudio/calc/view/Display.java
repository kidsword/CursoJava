package com.kidswordstudio.calc.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kidsword.calc.model.Memoria;
import com.kidsword.calc.model.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	
	private final JLabel label;
	public Display() {
		
		Memoria.getInstacia().adicionarObservador(this);
		setBackground(new Color(46,49,56));
		label =  new JLabel(Memoria.getInstacia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));		
		add(label);
	}
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	
		
	}
	

}
