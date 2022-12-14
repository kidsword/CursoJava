package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double temperFarenheit = 10.0;
		double temperCelsius = ConvetToCelsius(temperFarenheit);
		PrintCelsius(temperCelsius);

		temperFarenheit = 0;
		temperCelsius = ConvetToCelsius(temperFarenheit);
		PrintCelsius(temperCelsius);
		
		temperFarenheit = 86;
		temperCelsius = ConvetToCelsius(temperFarenheit);
		PrintCelsius(temperCelsius);
		
		double[] temperFarenheitList = {0.0, 50.0, 48.0, 29.32, 89.21, 28.47};
		
		for(double i : temperFarenheitList){
			temperFarenheit = i;
			temperCelsius = ConvetToCelsius(temperFarenheit);
			PrintCelsius(temperCelsius);
		}

	}

	private static double ConvetToCelsius(double temperFarenheit) {
		final double ajuste = 32.0;
		final double fator = 5.0 / 9.0;
		double result = (temperFarenheit - ajuste) * fator;
		return result;
	}

	private static void PrintCelsius(double value) {

		System.out.println("O resultado é " + value + "ºC.");
	}

}
