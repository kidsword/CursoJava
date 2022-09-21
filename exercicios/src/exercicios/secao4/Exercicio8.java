package exercicios.secao4;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		/**
		 * 8. Criar um programa que receba uma palavra e imprime no console letra por letra.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe uma palavra: ");
		String userValue = scan.next();
		System.out.println();			
		//uma forma
		for(int i = 0; i < userValue.length(); i++) {
			System.out.println(userValue.substring(i, i + 1));
		}
		System.out.println();			
		//Outra forma
		char letras[] = userValue.toCharArray();
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}		

		scan.close();

	}
}
