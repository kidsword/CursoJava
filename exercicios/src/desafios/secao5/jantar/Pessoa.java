package desafios.secao5.jantar;

public class Pessoa {
	String nome;
	double peso;
	
	public Pessoa(){}
	
	public Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida refeicao) {
		if(refeicao != null)
			this.peso += refeicao.peso;
	}
	String apresentar() {
		return "Olá eu sou o " + this.nome + ", e peso " + this.peso + "kg.";
	}
}
