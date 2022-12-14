package exercicios.secao3;

import java.util.Scanner;

public class BodyMassindex {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe seu peso em kilogramas (kg): ");
		double peso = ent.nextDouble();		
		
		System.out.println("Informe sua altura em centímetros (cm): ");
		double altura = ent.nextDouble();
		
		double result = peso / Math.pow(altura/100, 2);
		
		System.out.println(String.format("Seu Índice de Massa Muscular (IMC) é: %.2f", result));
		ent.close();
		
	}

}
