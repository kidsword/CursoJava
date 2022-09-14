package fundamentos;

import javax.swing.JOptionPane;

public class Conversoes {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		
		//FLOAT
		float b = (float) 1.1234556;
		System.out.println(b);
		b = 12234.5432F;
		System.out.println(b);
		
		//INT
		int c =4;
		byte d = (byte)c;
		System.out.println(d);
		
		/// NUM TO STRING
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		Integer num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		
		///STRING TO NUM
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println(valor1 + valor2);
		
		
		var d1 = Double.parseDouble(valor1);
		var d2 = Double.parseDouble(valor2);		
		var soma  = d1 + d2;
		System.out.println(soma);
		
		
	}

}
