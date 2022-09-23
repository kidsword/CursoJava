package lambdas;

import java.util.function.BinaryOperator;

import utils.Messenger;

public class CalculoTeste3 extends Messenger{
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x,y)-> {
			return x+y;
		};
		
		// JAVa não permite a conversão implícita de um tipo int primitivo para double classe
		msg(calc.apply(2.0, 3.0));
		
		calc = (x,y) -> x * y;
		msg(calc.apply(2.0, 3.0));
		
	}

}
