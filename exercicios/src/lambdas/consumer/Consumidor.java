package lambdas.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import lambdas.predicado.Produto;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);

		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(p1);
		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.8, 0.18);
		Produto p5 = new Produto("Lapis", 12.34, 0.19);
		Produto p6 = new Produto("Lapiseira", 21.99, 0.30);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		produtos.forEach(imprimir);
		produtos.forEach(p-> System.out.println(p.preco));
		produtos.forEach(System.out::println);

	}
}
