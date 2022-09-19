package exercicios.secao4;

import java.util.Scanner;

public class CalcMedia {
	/** 3. Criar um programa que receba duas notas parciais, calcular a média final. 
	 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
	 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
	 * caso contrário imprime no console "Reprovado". */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		var media = (nota1 + nota2) /2; 
				
		System.out.print("Sua média foi: " + media + ". Está ");
		
		if (media >= 7.0) {
			System.out.println("Aprovado");
		}
		else if(media >= 4.0 && media < 7.0)
			System.out.println("de Recuperação");
		else {
			System.out.println("Reprovado");
		}
		scanner.close();
	}
}
