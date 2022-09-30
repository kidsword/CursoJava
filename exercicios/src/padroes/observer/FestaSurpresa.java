package padroes.observer;

public class FestaSurpresa {
	public static void main(String[] args) {
		var namorada = new Namorada();
		var porteiro = new Porteiro();
		
		porteiro.registerObs(namorada);
		
		porteiro.registerObs(e -> {
			System.out.println("*** Esse foi via lambda! ***");
		});
		porteiro.monitorar();
	}

}
