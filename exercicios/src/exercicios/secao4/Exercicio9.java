package exercicios.secao4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio9 {
	public static void main(String[] args) {
		/**
		 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
		 */

		Scanner scan = new Scanner(System.in);		
		int maiorValor = 0; 

		for(int i = 1; i <= 10; i++) {
			System.out.print("Informe um número: ");
			int userValue = scan.nextInt();
			if(userValue > maiorValor) maiorValor = userValue;			
		}
		System.out.println("o maior valor informado foi: " + maiorValor);			

		scan.close();

	}
}
