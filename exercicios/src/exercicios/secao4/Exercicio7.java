package exercicios.secao4;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		/**
		 * 7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
		 * caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */

		Scanner scan = new Scanner(System.in);
		int total = 0;
		int userValue = 0;
		
		do {
			System.out.print("Informe um número: ");
			userValue = scan.nextInt();
			if(userValue > 0)
				total += userValue;
			System.out.println();
			System.out.println("Soma dos valores informados: " + (total));			
			
		} while (userValue >= 0);


		scan.close();

	}
}
