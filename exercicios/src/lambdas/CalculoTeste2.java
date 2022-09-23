package lambdas;

import utils.Messenger;

public class CalculoTeste2 extends Messenger{
	public static void main(String[] args) {
		Calculo calc = (x,y)-> {
			return x+y;
		};
		msg(calc.executar(2, 3));
		
		calc = (x,y) -> x * y;
		msg(calc.executar(2, 3));
		
	}

}
