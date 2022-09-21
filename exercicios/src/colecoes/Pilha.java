package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<>();
		
		//Push e Add -> adicionam elementos à fila
		//Diferença é o comportamento quando a fila estiver cheia
		pilha.add("O Pequeno Principe"); // retorna false
		pilha.push("O Hobbit"); // lança exception
		pilha.push("Mulheres da China"); // lança exception
		pilha.push("Gênio Indomável"); // lança exception
		
		//Peek e Elemento -> obter o próximo elemento da fila, sem remover
		//Diferença é o comportamento quando a fila estiver vazia
		msg(pilha.peek()); // retorna false
		msg(pilha.element()); // lança exception
		
		//Poll, Pop e Remove -> obter o próximo elemento da fila, removendo-o
		//Diferença é o comportamento quando a fila estiver vazia
		msg(pilha.poll()); // retorna false
		msg(pilha.remove()); /// lança exception
		msg(pilha.pop()); /// lança exception
		
		
		msg(pilha.size()); //tamanho da fila
		//pilha.clear(); //limpa a fila
		msg(pilha.isEmpty()); //verifica se está vazia
		//fila contains(...); verifica se a fila possui o vaçlor informado
		
		for(String livro: pilha) {
			msg("\"" +  livro+ "\"");
		}
		

	}
	static void msg(Object obj) {
		System.out.println(obj);
	}
}
