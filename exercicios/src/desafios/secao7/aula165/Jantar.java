package desafios.secao7.aula165;

public class Jantar {
	public static void main(String[] args) {
		var convidado = new Pessoa(99.65);
		var ingrediente1 = new Arroz(0.2);
		var ingrediente2 = new Feijao(0.1);

		msg(convidado.getPeso());
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		msg(convidado.getPeso());

		convidado.comer(ingrediente2);
		msg(convidado.getPeso());

		var sobremesa = new Sorvete(0.4);
		convidado.comer(sobremesa);

		msg(convidado.getPeso());
	}

	static void msg(Object obj) {
		System.out.println(obj);
	}

	static void msgf(String msg, Object... args) {
		System.out.printf(msg, args);
		System.out.println();
	}

}
