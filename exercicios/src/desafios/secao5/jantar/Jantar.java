package desafios.secao5.jantar;

public class Jantar {

	public static void main(String[] args) {
		
		var ref1 = new Comida("arroz", 0.250);
		var ref2 = new Comida("batata", 0.320);
		var ref3 = new Comida("strogonoff", 0.5);
		
		var p = new Pessoa("João", 80.0);
		
		p.comer(ref1);
		System.out.println(p.apresentar());
		p.comer(ref2);
		System.out.println(p.apresentar());
		p.comer(ref3);
		System.out.println(p.apresentar());
		p.comer(ref3);
		System.out.println(p.apresentar());

	}

}




