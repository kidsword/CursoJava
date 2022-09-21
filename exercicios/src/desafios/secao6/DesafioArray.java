package desafios.secao6;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double somaNotas = 0;
		
		System.out.print("Quantas notas pretende informar? ");
		int totalNotas = sc.nextInt();
		
		double[] notas = new double[totalNotas];
				
		for(var i = 0; i < totalNotas; i++) {
			System.out.println();
			System.out.print("informe a nota " + (i+1) + ": ");
			notas[i]= sc.nextDouble();	
		}
		
		System.out.println();
		for(var nota: notas) {
			somaNotas += nota;
		}
		System.out.println("A média de notas é: " + (somaNotas/totalNotas));
		
		sc.close();
		
		
	}

}
