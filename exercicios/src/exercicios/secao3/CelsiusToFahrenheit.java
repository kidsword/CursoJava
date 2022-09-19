package exercicios.secao3;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double temper = ent.nextDouble();
		
		double temperCelsius = ConvetToFarenheit(temper);
		PrintCelsius(temperCelsius);
	}

	private static double ConvetToFarenheit(double temper) {
		final double ajuste = 32.0;
		final double fator = 5.0 / 9.0;
		double result = (temper * fator) + ajuste;
		return result;
	}

	private static void PrintCelsius(double value) {

		System.out.println("O resultado é " + value + "º Fahrenheit");
	}
}
