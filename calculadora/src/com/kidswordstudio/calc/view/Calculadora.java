package com.kidswordstudio.calc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	public Calculadora() {
		
		organizarLayout();
		changerTitleBarcolor();
		
		setVisible(true);		
		setTitle("Calculadora");
		setSize(232,322);		
		setLocationRelativeTo(null);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);		


	}
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		var display = new Display();
		display.setPreferredSize(new Dimension(233,60));
		add(display, BorderLayout.NORTH);
				
		var teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);	
		
	}
	
	private void changerTitleBarcolor() {
		var uiDefaults = UIManager.getDefaults();
		uiDefaults.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.gray));
		uiDefaults.put("activeCaptionText", new javax.swing.plaf.ColorUIResource(Color.white));
		
		uiDefaults.put("InternalFrame.activeTitleBackground", new ColorUIResource(Color.black ));
		uiDefaults.put("InternalFrame.activeTitleForeground", new ColorUIResource(Color.WHITE));
		uiDefaults.put("InternalFrame.titleFont", new Font("Dialog", Font.PLAIN, 11));
		
		setDefaultLookAndFeelDecorated(true);	
	}
	
	public static void main(String[] args) {
		new Calculadora();
	}
}
