package controle;

import java.util.Scanner;

public class IfAula {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = scan.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabéns!");
		}
		else if(media >= 4.5 && media < 7)
			System.out.println("Recuperação");
		else
			System.out.println("Reprovado");

			
		
		scan.close();
	}
}
