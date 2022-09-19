package exercicios.secao4;

import java.util.Scanner;

public class CheckPair {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		var sentence = "O número %d %s entre 0 e 10, e é %s";

		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		var isPair = (num % 2 == 0 ? "par" : "ímpar");

		if (num >= 0 && num <= 10)
			sentence = String.format(sentence, num, "está", isPair);
		else
			sentence = String.format(sentence, num, "não está", isPair);
		
		System.out.println(sentence);
		

		scan.close();
	}
}
