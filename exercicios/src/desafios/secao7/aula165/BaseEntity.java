package desafios.secao7.aula165;

public class BaseEntity {
	private double peso;
	
	BaseEntity(double peso){
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso>= 0)
			this.peso = peso;
	}
	

}
