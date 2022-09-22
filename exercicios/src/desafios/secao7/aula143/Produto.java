package desafios.secao7.aula143;

public class Produto extends BaseEntity {
	double preco;
	
	Produto (String nome, double preco){
		super(nome);
		this.preco = preco;
	}
}
