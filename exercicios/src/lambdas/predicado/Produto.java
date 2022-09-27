package lambdas.predicado;

import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class Produto extends Object{
	public final String nome;
	public final double preco;
	public final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	private ToDoubleFunction<Produto> vrFinal = prod -> (prod.preco * (1 - prod.desconto));
	
	private Predicate<Produto> caro 
		= prod -> vrFinal.applyAsDouble(prod)  >= 750.0;
		
	public Double valorFinal() {
		return vrFinal.applyAsDouble(this);
	}
	
	public Boolean isCaro() {
		return caro.test(this);	
	}
	
	public String toString() {
		return "Nome: " + this.nome + " tem preço de R$ " + this.valorFinal();
	}

}
