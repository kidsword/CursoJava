package com.kidswordstudio.cm.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	private boolean testeAdd (int lin, int col) {
		Campo  vizinho = new Campo(lin, col);
		return campo.add(vizinho);
	}

	@Test
	void testeVizinhoDistancia1Esquerda() {
		var resultado = testeAdd(3,2);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {
		var resultado = testeAdd(3,4);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Emcima() {
		var resultado = testeAdd(2,3);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Abaixo() {
		var resultado = testeAdd(4,3);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2() {
		var resultado = testeAdd(2,2);
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		var resultado = testeAdd(1,1);
		assertFalse(resultado);
	}
	

}
