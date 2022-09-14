package desafios;

import java.util.Scanner;

public class DesafioDeConversao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
		System.out.print("Informe o primeiro salário:");
		String sal1 = teclado.next();
		System.out.print("Informe o segundo salário:");
		String sal2 = teclado.next();
		System.out.print("Informe o terceiro salário:");
		String sal3 = teclado.next();
		
		var val1 = Double.parseDouble(sal1.replace(',', '.'));
		var val2 = Double.parseDouble(sal2.replace(',', '.'));
		var val3 = Double.parseDouble(sal3.replace(',', '.'));
		
		double media = (val1 + val2 + val3) / 3.0;
		System.out.println(String.format("A média de salário é R$%.2f", media));
		
		teclado.close();
		
	}
	

}
