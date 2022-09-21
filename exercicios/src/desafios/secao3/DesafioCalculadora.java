package desafios.secao3;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//ler num1
		//ler num2
		//+ - * / %	
		
		Scanner ent = new Scanner(System.in);		
			
		System.out.println("Informe o num 1: ");
		var num1 = ent.nextDouble();
		
		System.out.println("Informe o num 2: ");
		var num2 = ent.nextDouble();
		
		System.out.println("Informe a operação: ");
		var op = ent.next();
		
		
		//Lógica ???
		double result = "+".equals(op) ? num1 + num2 : 0;
		result = "-".equals(op) ? num1 - num2 : result;
		result = "*".equals(op) ? num1 * num2 : result;
		result = "/".equals(op) ? num1 / num2 : result;
		result = "%".equals(op) ? num1 % num2 : result;
		
		System.out.println(String.format("O resultado ds operação \"%.2f %s %.2f\" é igual a %f", num1, op, num2, result) );
		
		ent.close();
		
	}
}
