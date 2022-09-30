package lambdas.predicado;

import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

import utils.Messenger;
@SuppressWarnings(value = { "unused" })
public class Predicado extends Messenger {
	public static void main(String[] args) {
		
		ToDoubleFunction<Produto> valorFinal = prod -> (prod.preco * (1 - prod.desconto));
		
		Predicate<Produto> isCaro 
			= prod -> valorFinal.applyAsDouble(prod)  >= 750.0;
			
		
			
		Produto produto = new Produto("Notebook", 3893.89, 0.7523);
		
		var msg = "Produto: %s \n"
				+ "Valor: R$%.2f \n"
				+ "Desconto: %.2f%% \n"
				+ "Valor Final: R$%.2f \n"
				+ "É caro? %s";
		
		/*msgf(msg, 
				produto.nome, 
				produto.preco, 
				produto.desconto * 100, 
				valorFinal.applyAsDouble(produto), 
				isCaro.test(produto) ? "sim" : "não");*/
		
		msgf(msg, 
				produto.nome, 
				produto.preco, 
				produto.desconto * 100, 
				produto.valorFinal(), 
				produto.isCaro() ? "sim" : "não");
		
		
	}

}
