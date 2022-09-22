package oo.composicao.testes;

import oo.composicao.Carro;

public class CarroTeste {
	public static void main(String[] args) {
		var c1 = new Carro();
		msg("Está ligado? " + c1.estaLigado());
		
		c1.onOff();
		msg("Está ligado? " + c1.estaLigado());
		
		msg(c1.motor.giros());
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		msg(c1.motor.giros());
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		//Faltou encapsulamento!!!
		//c1.motor.fatorinjecao = -30;
		
		msg(c1.motor.giros());

	}
	
	static void msg(Object obj) {
		System.out.println(obj);
	}
}
