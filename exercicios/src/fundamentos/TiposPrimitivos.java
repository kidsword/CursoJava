package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_445.00F;
		double vendasAcumuladas = 2991797103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false; //true
		
		//Tipo de character
		char status = 'A'; //Ativo
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos/2);
		System.out.println(pontosAcumulados/vendasAcumuladas);
		System.out.println(id+ ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
				

	}
}
