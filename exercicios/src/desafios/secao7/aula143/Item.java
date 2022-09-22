package desafios.secao7.aula143;

public class Item {
	public int quantidade;
	public Produto produto;
	
	Item(int quantidade, String nome, double preco){
		this.quantidade = quantidade;
		this.produto = new Produto(nome, preco);
	}

}
