package desafios.secao8;

import lambdas.predicado.Produto;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
@SuppressWarnings(value = { "unused" })
public class Desafio {
	public static void main(String[] args) {
		/*
		 * 1. A partir do produto, calcular o preco real (com desconto) 
		 * 2. Imposto Municipal: >= 2500 (8.5%)/ <2500 (isento) 
		 * 3. Frete: > = 3000 (100) / < 3000 * (50) 
		 * 4. Arredondar: Deixar duas casas decimais 
		 * 5. Formatar: R$1234,56
		 */

		var produto = new Produto("Notebook", 3799.99, 0.05);

		Function<Produto, Double> valorFinal = prod -> (prod.preco * (1 - prod.desconto));
		Predicate<Produto> isCaro = prod -> valorFinal.apply(prod) >= 750.0;
		UnaryOperator<Double> impostoMunicipal = n -> n * (n >= 2500 ? 1.085 : 1);
		UnaryOperator<Double> frete = n -> n + (n >= 3000 ? 100 : 50);
		UnaryOperator<Double> arredondar = n -> Math.ceil(n);
		Function<Double, String> formatar = n -> String.format("R$%.2f", n);

		
		var resultado = valorFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto);
		
		var resultado2 = impostoMunicipal
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto.valorFinal());
		
		System.out.println("O preço final é " + resultado);
		System.out.println("O preço final é " + resultado2);

				

		// UnaryOperator<Double>

		// prod.valorFinal()

	}

}
