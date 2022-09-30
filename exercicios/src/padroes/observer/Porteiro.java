package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	private List<ObservadorChegadaAniversariante> observers = new ArrayList<>();
	
	public void registerObs(ObservadorChegadaAniversariante obs) {
		observers.add(obs);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("O aniversariante chegou? ");
			valor = entrada.nextLine();
			if("sim".equalsIgnoreCase(valor)) {
				//Criar evento
				var evento = new EventoChegadaAniversariante(new Date());
				
				//notificar observadores
				observers.stream()
					.forEach(o -> o.chegou(evento));
				
			}
			else {
				System.out.println("Alarme falso!");
			}
			
		}
		entrada.close();		
	}
			

}
