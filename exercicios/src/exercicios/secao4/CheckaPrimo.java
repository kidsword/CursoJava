package exercicios.secao4;

import java.util.Scanner;

public class CheckaPrimo {
	/*
	 * 4. Criar um programa que receba um número e diga se ele é um número primo.
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int n = scan.nextInt();		
		
		if(isPrime(n))
			System.out.println("O número é primo");
		else
			System.out.println("O número não é primo");

		scan.close();
	}
	
	
	private static boolean isPrime(int n) {
		if(n <= 1) return true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				System.out.println("O número é divisível por " + i);
				return false;
			}
		}
		return true;
	}
}
