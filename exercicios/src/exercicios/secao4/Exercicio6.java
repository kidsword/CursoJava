package exercicios.secao4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio6 {
	public static void main(String[] args) {
		/**
		 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
		 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
		 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
		 * o número armazenado.
		 */

		Scanner scan = new Scanner(System.in);
		int secretNumber = ThreadLocalRandom.current().nextInt(0, 100);
		int userValue = -1;
		boolean AcertouMiseravel = false;
		int tentativas = 0;

		while (userValue != secretNumber || tentativas < 10) {
			System.out.print("Adivinhe em que número estou pensando entre 0 e 100: ");
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
