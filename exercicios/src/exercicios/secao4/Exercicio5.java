package exercicios.secao4;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		/** 5. Refatorar o exercício 04, utilizando a estrutura switch. */

		int contadorDeDivisores = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nDigite um numero: ");
		int numero = scan.nextInt();

		String divisores = "";

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				divisores += i + ", ";
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default: {
			System.out.println("O numero " + numero + "  não é um numero primo.");
			System.out.println(String.format("O número é divisível por %ssomando um total de %d divisores", 
					divisores,
					contadorDeDivisores));
			}
		}

		scan.close();

	}
}
