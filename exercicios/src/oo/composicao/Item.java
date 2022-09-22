package oo.composicao;

public class Item {
	public String nome;
	public int quantidade;
	public double preco;
	Compra compra; //Relação bidirecional entre as classes
	
	public Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
