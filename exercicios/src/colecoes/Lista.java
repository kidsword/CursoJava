package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("José"));
		
		System.out.println(lista.get(3));
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new Usuario("João")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		System.out.println("Tem? " + lista.contains(new Usuario("Bia")));
		
		for(var u: lista) {
			System.out.println(u.nome);
			System.out.println(u);
		}

	}
}
