package lambdas;

import utils.Messenger;

public class CalculoTeste1 extends Messenger{
	public static void main(String[] args) {
		Calculo calculo = new Somar();
		
		msg(calculo.executar(2, 3));
		
		calculo = new Multiplicar();
		msg(calculo.executar(2, 3));

	}
}
