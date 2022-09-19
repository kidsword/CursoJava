package exercicios.secao3;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("Informe o valor \"a\": ");
		int a = ent.nextInt();
		System.out.println("Informe o valor \"b\": ");
		int b = ent.nextInt();
		System.out.println("Informe o valor \"c\": ");
		int c = ent.nextInt();
	
	
		int delta = (b*b)- (4 * a * c);
		
		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);		
		System.out.println("\nO delta é: " + delta);
		
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		ent.close();
	
		
	}

}
