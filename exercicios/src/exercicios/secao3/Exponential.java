package exercicios.secao3;

import java.util.Scanner;

public class Exponential {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		double num = ent.nextDouble();
		
		var stringmodel = "%.2f%s = %.2f";
		
		System.out.println(String.format(stringmodel, num, (char) 178, Math.pow(num, 2)));
		System.out.println(String.format(stringmodel, num, (char) 179,  Math.pow(num, 3)));

		ent.close();
		
	}

}
