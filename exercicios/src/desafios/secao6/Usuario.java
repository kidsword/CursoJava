package desafios.secao6;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Usuario)) return false;
		
		var outro = (Usuario)obj;
		boolean nomeE = outro.nome.equals(this.nome);
		boolean emailE = outro.email.equals(this.email);
		
		return nomeE && emailE;  	
	}
}
