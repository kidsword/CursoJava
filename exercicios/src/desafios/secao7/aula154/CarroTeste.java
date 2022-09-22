package desafios.secao7.aula154;

public class CarroTeste {
	public static void main(String[] args) {
		
		var car1 = new Civic();
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		mostrarVelocidade(car1);
		
		var car2 = new Ferrari();
		car2.acelerar();
		car2.acelerar();
		car2.acelerar();
		car2.acelerar();
		car2.acelerar();
		car2.acelerar();
		mostrarVelocidade(car2);
		
		car1.frear();
		car1.frear();
		car1.frear();
		mostrarVelocidade(car1);
		
		car2.frear();
		car2.frear();
		car2.frear();
		mostrarVelocidade(car2);
		

	}
	
	static void msg(Object obj) {
		System.out.println(obj);
	}
	static void msgf(String msg, Object... args) {
		System.out.printf(msg, args);
		System.out.println();
	}
	
	static void mostrarVelocidade(Carro carro) {
		System.out.printf("O carro '%s' está a %d km/h", carro.nome, carro.velocidadeAtual);
		System.out.println();
	}
}
