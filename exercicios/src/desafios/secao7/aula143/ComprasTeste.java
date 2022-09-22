package desafios.secao7.aula143;

public class ComprasTeste {
	public static void main(String[] args) {
		
		var cli = new Cliente("Rosa");
		
		var compra1 = new Compra();
		compra1.addItem("Leite", 12, 3.50);
		compra1.addItem("arroz", 1, 24.9);
		compra1.addItem("feijão", 2, 13.72);
		compra1.addItem("farinha", 2, 9.38);
		compra1.addItem("milho", 3, 4.75);
		
		
		var compra2 = new Compra();
		compra2.addItem("Leite", 12, 3.50);
		compra2.addItem("milho", 4, 4.75);
		compra2.addItem("Leite Condessado", 6, 3.83);
		
		cli.compras.add(compra1);
		cli.compras.add(compra2);
		
		System.out.println(cli.showTotalValue());
		

	}
}
