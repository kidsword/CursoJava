package desafios.secao3;

public class DesafioAritimeticos {
	public static void main(String[] args) {

		Desafio();
		
		DesafioMeu();
		
	}
	
	private static void Desafio() {
		
		var numA = Math.pow((6 * (3+2)), 2);		
		var denA =  3 * 2;
		var superiorA = numA / denA;		
		System.out.println(superiorA);
		
		var numB = (1-5) *(2-7) ;		
		var denB =  2;
		var superiorB = Math.pow(numB/ denB, 2);;		
		System.out.println(superiorB);
		
		var superior = Math.pow(superiorA - superiorB, 3) ;
		System.out.println(superior);		
		
		var inferior =  Math.pow(10, 3) ;
		System.out.println(inferior);
		
		var result =  superior / inferior;
		System.out.println(result);		
		
	}
	
	private static void DesafioMeu() {
		
		var firstOperator = Math.pow((6 * (3+2)), 2) / (3 * 2);
		System.out.println(firstOperator);
		
		var secondoperator = Math.pow((1-5) *(2-7) / 2, 2);
		System.out.println(secondoperator);
		
		var result = Math.pow(firstOperator - secondoperator, 3) / Math.pow(10, 3);
		System.out.println(result);		
		
	}
	
	private static void sample() {
		int a = 2 + 3 * 4;
		int b = (int)Math.pow(a, 3);
		var c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
	}

}
