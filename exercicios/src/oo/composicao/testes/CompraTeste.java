package oo.composicao.testes;

import oo.composicao.Compra;
import oo.composicao.Item;

public class CompraTeste {
	public static void main(String[] args) {
		var c1 = new Compra();
		c1.cliente = "Rosa";
		
		c1.addItems("leite", 12, 4.80);
		c1.addItems(new Item("Creme de Leite", 6, 3.45));
		c1.addItems("arroz", 1, 29.23);
		c1.addItems("feijão", 1, 23.40);
		
		msg("Total de itens: " + c1.itens.size());
		msgf("Valor Total: R$ %.2f", c1.getTotalValue());

	}
	static void msg(Object obj) {
		System.out.println(obj);
	}
	static void msgf(String msg, Object... args) {
		System.out.printf(msg, args);
		System.out.println();
	}
}
