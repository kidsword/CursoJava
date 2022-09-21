package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos à fila
		//Diferença é o comportamento quando a fila estiver cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lança exception
		
		//Peek e Elemento -> obter o próximo elemento da fila, sem remover
		//Diferença é o comportamento quando a fila estiver vazia
		fila.peek(); // retorna false
		fila.element(); // lança exception
		
		//Pool e Remove -> obter o próximo elemento da fila, removendo-o
		//Diferença é o comportamento quando a fila estiver vazia
		fila.poll(); // retorna false
		fila.remove(); /// lança exception
		
		
		fila.size(); //tamanho da fila
		fila.clear(); //limpa a fila
		fila.isEmpty(); //verifica se está vazia
		//fila contains(...); verifica se a fila possui o vaçlor informado
		

	}
}
