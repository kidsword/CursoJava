package lambdas.function;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = num -> num %2 == 0 ? "Par": "Ímpar";
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = val -> "o Resultado é: " +  val;
		Function<String, String> empolgado = val -> val + "!!!!!!";
		Function<String, String> duvida = val -> val + "??????";
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		String resultadoDuvida = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(32);
		
		System.out.println(resultadoFinal);
		System.out.println(resultadoDuvida);
		
	}
}
