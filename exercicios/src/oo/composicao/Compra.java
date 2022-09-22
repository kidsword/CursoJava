package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	public String cliente;
	public ArrayList<Item> itens = new ArrayList<>();
	
	public void addItems(Item item) {
		item.compra = this;
		this.itens.add(item);
	}
	public void addItems(String name, int quantity, double price) {
		this.addItems(new Item(name, quantity, price));
	}
	
	public double getTotalValue() {
		double result = 0;
		for(var i : itens)
			result += (i.preco * i.quantidade);
		
		return result;		
	}

}
