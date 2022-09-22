package desafios.secao7.aula143;

public class Compra extends BaseListGeneric<Item> {
	
	void addItem(String nome, int quant, double preco) {
		this.items.add(new Item(quant, nome, preco));		
	}
	
	public double getTotal() {
		double total = 0;
		for(var i : this.items) 
			total += i.quantidade * i.produto.preco;
		return total;
	}

}
