package desafios.secao5;

public class DesafioData {
	int dia = 1;
	int mes = 1;
	int ano = 1970;
	
	public DesafioData () {
	}
	
	public DesafioData (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	public static void main(String[] args) {
		
		var d1 = new DesafioData();
		System.out.println(d1.obterDataFormatada());
		var d2 = new DesafioData(10,12,2022);
		System.out.println(d2.obterDataFormatada());
	}
}
