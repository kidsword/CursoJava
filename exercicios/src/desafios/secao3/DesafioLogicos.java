package desafios.secao3;

public class DesafioLogicos {
	public static void main(String[] args) {

		var trabalho1 = false;
		var trabalho2 = false;
		
		var comprouTv50 = trabalho1 && trabalho2;
		var comprouTv32 = trabalho1 ^ trabalho2; 		
		var tomouSorvete = trabalho1 || trabalho2;
		var maisSaudavel = !tomouSorvete;
		
		if(comprouTv32) 
			System.out.print("Compramos televisão de 32 polegadas");
		else if (comprouTv50)
			System.out.print("Compramos televisão de 50 polegadas");
		else
			System.out.print("Não Compramos nenhuma televisão");
		
		if(tomouSorvete)
			System.out.print(" e tomamos sorvete!");
		else
			System.out.print(" e ficamos com fome... :(");
		
		System.out.println();
		System.out.println("Comprou TV 50\"? " +  comprouTv50);
		System.out.println("Comprou TV 32\"? " +  comprouTv32);
		System.out.println("Tomou sorvete? " +  tomouSorvete);
		System.out.println("Está mais saudável? " +  maisSaudavel);
		
	}	
	

}
