package desafios.secao7.aula143;

import java.util.ArrayList;

public class Cliente extends BaseEntity{
	
	public final ArrayList<Compra> compras = new ArrayList<>(); 
	
	Cliente(String nome){
		super(nome);
	}
	
	public double getTotalValue() {
		double total = 0;
		for(var compra : compras) 
				total += compra.getTotal();			
		
		return total;
	}
	
	public String showTotalValue() {
		return String.format("Total de compras: %.2f", this.getTotalValue());
	}

}
