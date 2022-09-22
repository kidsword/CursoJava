package desafios.secao7.aula154;

public class Carro {
	String nome;
	final int VelocidadeMaxima;
	int aceleracao = 5;
	public int velocidadeAtual = 0;
	
	
	Carro(int velocidadeMaxima){
		this.VelocidadeMaxima = velocidadeMaxima;				
	}
	
	void acelerar() {
		velocidadeAtual += aceleracao;
		if(velocidadeAtual > VelocidadeMaxima) velocidadeAtual = VelocidadeMaxima;
	}
	
	void frear() {
		velocidadeAtual -= aceleracao;
		if(velocidadeAtual < 0) velocidadeAtual = 0;
	}

}
