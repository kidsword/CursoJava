package com.kidswordstudio.cm.view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import com.kidswordstudio.cm.model.Campo;
import com.kidswordstudio.cm.model.CampoEvento;
import com.kidswordstudio.cm.model.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener{
	
	private final Color BG_PADRAO = new Color(184,184,184);
	private final Color BG_ABERTO = new Color(220,220,220);
	private final Color BG_MARCAR = new Color(8,179,247);
	private final Color BG_EXPLODIR = new Color(189,66,68);
	private final Color TEXTO_VERDE = new Color(0,100,0);
	
	
	private Campo campo;
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0));
		addMouseListener(this);
		campo.registerObs(this);
	}
	
	@Override
	public void eventoOcorreu(Campo c, CampoEvento e) {
		switch(e) {
		case Abrir:
			aplicarEstiloAbrir();
			break;
		case Marcar:
			aplicarEstiloMarcar();
			break;
		case Explodir:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
			break;
		}
	}

	private void aplicarEstiloPadrao() {
		setBackground(BG_PADRAO);
		setText("");		
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setForeground(Color.WHITE);
		setText("X");		
	}

	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCAR);
		setForeground(Color.BLACK);
		setText("?");		
	}

	private void aplicarEstiloAbrir() {
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		if(campo.isMined()) {
			setBackground(BG_EXPLODIR);
			return;
		}
		
		setBackground(BG_PADRAO);		
		switch ((int)campo.minesOnNeighborhood()) {
			case 1: {
				setForeground(TEXTO_VERDE);
				break;
			}
			case 2: {
				setForeground(Color.BLUE);
				break;
			}
			case 3: {
				setForeground(Color.YELLOW);
				break;
			}
			case 4:
			case 5:
			case 6:{
				setForeground(Color.RED);
				break;
			}
			default:{
				setForeground(Color.PINK);
				break;
			}
		}
		
		String valor = !campo.securityNeighbors() ? 
				campo.minesOnNeighborhood() + "" : "";
		valor = campo.isMined() ? "*": valor;
		setText(valor);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
	
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			campo.open();
		}
		else {
			campo.turnMark();
		}	
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
