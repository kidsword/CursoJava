package excecoes.personalizadas;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	
	private String nomeDoAtributo;
	public StringVaziaException(String nomeDoAtributo) {
		// TODO Auto-generated constructor stub
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo \"%s\" é está vazio.", this.nomeDoAtributo);
	}
}
