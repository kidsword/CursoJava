package colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;


public class ConjuntoComportado {
	public static void main(String[] args) {
		//Set<String> lstAprovados = new HashSet<>();
		SortedSet<String> lstAprovados = new TreeSet<>();
		
		lstAprovados.add("Ana");
		lstAprovados.add("Carlos");
		lstAprovados.add("Antonio");
		lstAprovados.add("João");
		lstAprovados.add("Joana");
		lstAprovados.add("Evelise");
		
		for(String candidato: lstAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(12);
		nums.add(134);
		nums.add(21);
		nums.add(42);
		nums.add(57);
		
		for(int i: nums) {
			System.out.println(i);
		}
		
		
	}
}
