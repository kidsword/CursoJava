package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet cjn = new HashSet();
		
		cjn.add(1.2);
		cjn.add(true);
		cjn.add("teste");
		cjn.add(1);
		cjn.add('x');
		
		msg(cjn.size());
		
		cjn.add("Teste");
		cjn.add('x');
				
		msg(cjn.size());
			
		System.out.println(cjn.remove("Teste"));
		System.out.println(cjn.remove("teste"));
		System.out.println(cjn.remove('x'));
		
		System.out.println(cjn.contains('x'));
		System.out.println(cjn.contains(1));
		System.out.println(cjn.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(cjn);
		
		cjn.retainAll(nums);
		System.out.println(cjn);
		
		cjn.clear();
		System.out.println(cjn);
		
		
		
	}
	
	static void msg(int size) {
		System.out.println("Tamanho é " + size);
	}
}
