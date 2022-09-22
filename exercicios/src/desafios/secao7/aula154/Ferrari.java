package desafios.secao7.aula154;

public class Ferrari extends Carro{
	int aceleracao = 15;
	
	Ferrari(){
		this(315);
		nome = "Ferrari";
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		nome = "Ferrari";
	}
	
	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		//super.acelerar();
		//super.acelerar();
		//super.acelerar();
		
		// OU poderia ser: velocidadeAtual += 15;
		
		velocidadeAtual += aceleracao;
		if(velocidadeAtual > VelocidadeMaxima) velocidadeAtual = VelocidadeMaxima;
	}
	
}
