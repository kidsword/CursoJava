package exercicios.secao3;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		double temperFarenheit = ent.nextDouble();
		
		double temperCelsius = ConvetToCelsius(temperFarenheit);
		PrintCelsius(temperCelsius);
	}

	private static double ConvetToCelsius(double temperFarenheit) {
		final double ajuste = 32.0;
		final double fator = 5.0 / 9.0;
		double result = (temperFarenheit - ajuste) * fator;
		return result;
	}

	private static void PrintCelsius(double value) {

		System.out.println("O resultado é " + value + "º Celsius");
	}
}
