package oo.composicao;

public class Carro {
	public Motor motor = new Motor();
	
	public void acelerar() {
		motor.fatorinjecao += 0.4;
	}
	public void frear() {
		if(motor.fatorinjecao > 0.5)
			motor.fatorinjecao -= 0.4;
	}
	public void onOff() {
		motor.ligado = !motor.ligado;
	}
	
	public boolean estaLigado() {
		return motor.ligado;
	}
	
	
	

}
