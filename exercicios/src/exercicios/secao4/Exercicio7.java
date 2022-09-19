package exercicios.secao4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio7 {
	public static void main(String[] args) {
		/**
		 * 7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
		 * caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */

		Scanner scan = new Scanner(System.in);
		int total = 0;
		
		System.out.println("Informe um número: ");
		int userValue = 0;
		
		do {
			
			
		} while (userValue > 0);

		while (userValue != secretNumber || tentativas < 10) {
			
			userValue = scan.nextInt();

			if (userValue != secretNumber) {
				System.out.print("Errou!!!");
				System.out.print(
						String.format("O número que pensei é %s!", userValue > secretNumber ? "MENOR" : "MAIOR"));
			} else {
				AcertouMiseravel = true;
				break;
			}

			tentativas++;
			System.out.println("Restam apenas " + (10 - tentativas) + " tentativas");
		}

		if (AcertouMiseravel)
			System.out.println("Parabéns! Acertou o número! Até que você não é tão burro...");
		else
			System.out.println("Não conseguiu! Que pena! Eu estava pensando no número " + secretNumber);

		scan.close();

	}
}
