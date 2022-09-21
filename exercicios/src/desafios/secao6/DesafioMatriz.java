package desafios.secao6;

import java.util.Scanner;

public class DesafioMatriz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double somaNotas = 0;

		System.out.print("Quantos alunos? ");
		int totalAlunos = sc.nextInt();

		System.out.print("Quantas notas pretende informar? ");
		int totalNotas = sc.nextInt();

		double[][] notas = new double[totalAlunos][totalNotas];

		for (var i = 0; i < notas.length; i++) {
			System.out.println();
			for (var j = 0; j < notas[i].length; j++) {
				System.out.printf("informe a nota %d do aluno %d: ", j+1, i+1);
				notas[i][j] = sc.nextDouble();
				somaNotas += notas[i][j];
			}
		}
		System.out.println();

		double media = somaNotas / (totalAlunos* totalNotas);
		System.out.println("A média de notas é: " + media);

		sc.close();

	}

}
