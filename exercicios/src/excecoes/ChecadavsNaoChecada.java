package excecoes;

public class ChecadavsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();			
		} catch (RuntimeException e) { 
			/*RuntimeException e herdeiras não tem obrigatoriedade de ser tratadas. 
			* Exceptions e Errors tem obrigatoriedade. 
			* Para as exceções checadas, todos os métodos envolvidos que NÃO TRATAM a exceção
			* precisa ter a declaração "throws" na assinatura
			*/
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace(); // imprime o o stacktrace completo do erro

		}
		
		try {
			geraErro1();			
		} catch (Throwable e) { //Throwable é a classe que engloba todas as exceptions
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM!!!");
	}
	//Exceção checada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro aqui #01");
	}
	//Exceção checada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro aqui #02");
	}
}
