package desafios.secao7.aula165;

public class Pessoa extends BaseEntity{
	
	public Pessoa(double peso) {
		super(peso);
		// TODO Auto-generated constructor stub
	}
	
	public void comer(Comida comida) {
		this.setPeso(getPeso() + comida.getPeso());
	}

}
