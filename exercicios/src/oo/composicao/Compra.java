package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	void addItems(Item item) {
		item.compra = this;
		this.itens.add(item);
	}
	void addItems(String name, int quantity, double price) {
		this.addItems(new Item(name, quantity, price));
	}
	
	double getTotalValue() {
		double result = 0;
		for(var i : itens)
			result += (i.preco * i.quantidade);
		
		return result;		
	}

}
