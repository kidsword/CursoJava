package desafios.secao6;

import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "joão moreira";
		u1.email = "joao.moreria@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "joão moreira";
		u2.email = "joao.moreria@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		System.out.println(u1.equals(new Date()));

	}
}
