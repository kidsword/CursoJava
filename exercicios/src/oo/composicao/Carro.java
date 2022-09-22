package oo.composicao;

public class Carro {
	Motor motor = new Motor();
	
	void acelerar() {
		motor.fatorinjecao += 0.4;
	}
	void frear() {
		if(motor.fatorinjecao > 0.5)
			motor.fatorinjecao -= 0.4;
	}
	void onOff() {
		motor.ligado = !motor.ligado;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
	
	

}
