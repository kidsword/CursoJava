package com.kidswordstudio.cm.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.kidswordstudio.cm.exception.ExplosaoException;

class CampoTeste {

	private Campo campo;

	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	private Campo add(int lin, int col) {
		return new Campo(lin, col);
	}

	private boolean testeAdd(int lin, int col) {
		Campo vizinho = add(lin, col);
		return campo.add(vizinho);
	}

	@Test
	void testeVizinhoDistancia1Esquerda() {
		var resultado = testeAdd(3, 2);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia1Direita() {
		var resultado = testeAdd(3, 4);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia1Emcima() {
		var resultado = testeAdd(2, 3);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia1Abaixo() {
		var resultado = testeAdd(4, 3);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia2() {
		var resultado = testeAdd(2, 2);
		assertTrue(resultado);
	}

	@Test
	void testeNaoVizinho() {
		var resultado = testeAdd(1, 1);
		assertFalse(resultado);
	}
	
	@Test
	void testeMarcacaoInicial() {
		assertFalse(campo.isMarked());
	}

	@Test
	void testeMarcacaoAlternar() {
		campo.turnMark();
		assertTrue(campo.isMarked());
	}
	@Test
	void testeMarcacaoAlternarDuasChamadas() {
		campo.turnMark();
		campo.turnMark();
		assertFalse(campo.isMarked());
	}
	@Test
	void testeAbrirNaoMinadoNaomarcado() {
		assertTrue(campo.open());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.turnMark();		
		assertFalse(campo.open());
	}

	@Test
	void testeAbrirMinadoMarcado() {
		campo.toMine();
		campo.turnMark();		
		assertFalse(campo.open());
	}
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.toMine();
		assertThrows(ExplosaoException.class, () ->{
			campo.open();
		});
	}
	@Test
	void testeAbrirComVizinhos() {
		
		var v11 = add(1,1);
		var v22 = add(2,2);
		
		v22.add(v11);
		
		campo.add(v22);		
		campo.open();

		assertTrue(v22.isOpened() && v11.isOpened() && campo.isOpened());	
	}
	@Test
	void testeAbrirComUmVizinhoMinado() {
		
		var v11 = add(1,1);
		v11.toMine();
						
		var v12 = add(1,2);		
		v12.add(v11);
		
		var v22 = add(2,2);
		v22.add(v11);
		v22.add(v12);
		
		campo.add(v22);		
		campo.open();
		//assertFalse(v12.isOpened());

		assertTrue(campo.isOpened() && v22.isOpened() && v12.isOpened() && !v11.isOpened());	
	}
}
