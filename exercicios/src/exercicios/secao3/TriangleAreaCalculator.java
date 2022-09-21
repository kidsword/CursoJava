package exercicios.secao3;

import java.util.Scanner;

public class TriangleAreaCalculator {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe o valor da base do triangulo (cm): ");
		double base = ent.nextDouble();
		System.out.println("Informe o valor da altura do triangulo (cm): ");
		double altura = ent.nextDouble();
		
		var stringmodel = "A área do triângulo é de %.2f cm%s";
		
		System.out.println(String.format(stringmodel, base * altura / 2, (char)178 ));
		ent.close();

		
	}

}
