package oo.composicao;

public class Item {
	String nome;
	int quantidade;
	double preco;
	Compra compra; //Relação bidirecional entre as classes
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
