package lambdas.binaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.BiFunction;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;
		
		var alunoMedia = media.apply(9.8, 5.7);
		
		System.out.println(alunoMedia);
		
		BiFunction<Double, Double, Boolean> aprovacao = (mediaNotas, mediaMin) -> mediaNotas >= mediaMin;

		Function<Boolean, String> conceito = m -> m ? "Aprovado" : "Reprovado";
		
		var aprovado = aprovacao.andThen(conceito).apply(alunoMedia, 7.0);
	
		System.out.println(aprovado);
		
	}

}
