package oo.composicao;

public class Motor {
	double fatorinjecao = 1;
	boolean ligado = false;
	
	public int giros() {
		return (int)Math.round(fatorinjecao * 3000);
	}

}
