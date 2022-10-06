package com.kidsword.calc.model;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando{
		ZERAR, SINAL, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA
	}
	
	private static Memoria instacia = new Memoria();
	private boolean substituir;
	private TipoComando ultimaOperacao = null;
	private String textoAtual = "";
	private String textoBuffer = "";
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	private Memoria() {
		// TODO Auto-generated constructor stub
	}
	public static Memoria getInstacia() {
		return instacia;
	}
	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0": textoAtual;
	}
	
	public void adicionarObservador(MemoriaObservador o) {
		observadores.add(o);		
	}
	
	public void processarComando(String texto) {
		var tipoComando = detectarTipoComando(texto);
		
		if(tipoComando == null)
			return;
		if(tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;			
		}
		else if(tipoComando == TipoComando.SINAL  && textoAtual.contains("-")) {
			textoAtual = textoAtual.substring(1);
		}
		else if(tipoComando == TipoComando.SINAL  && !textoAtual.contains("-")) {
			textoAtual = "-" + textoAtual;
		}
		else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? texto : textoAtual + texto;
			substituir = false;		
		}
		else {
			substituir = true;
			textoAtual = obterResultadorOperacao();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
			
		}
		

			//textoAtual += valor;
		observadores.stream().forEach(o -> o.valorAlterado(getTextoAtual()));
	}
	private String obterResultadorOperacao() {
		
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL )
			return textoAtual;
		
		var numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		var numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
		
		double resultado = 0;
		
		switch(ultimaOperacao) {
			case SOMA:
				resultado = numeroBuffer + numeroAtual;
				break;
			case SUB:
				resultado = numeroBuffer - numeroAtual;
				break;

			case DIV:
				resultado = numeroBuffer / numeroAtual;
				break;

			case MULT:
				resultado = numeroBuffer * numeroAtual;
				break;		
		}		
		var resultadoString = Double.toString(resultado).replace(".", ",");
			
		return resultadoString.endsWith(",0") ? resultadoString.replace(",0", "") : resultadoString;
	}
	private TipoComando detectarTipoComando(String valor) {
		if(textoAtual.isEmpty() && valor == "0")
			return null;
		if(isNumber(valor)) {
			return TipoComando.NUMERO;
		}
		
		if("AC".equals(valor))
			return TipoComando.ZERAR;
		if("+".equals(valor))
			return TipoComando.SOMA;
		if("*".equals(valor))
			return TipoComando.MULT;
		if("-".equals(valor))
			return TipoComando.SUB;
		if("/".equals(valor))
			return TipoComando.DIV;
		if("=".equals(valor))
			return TipoComando.IGUAL;
		if((".".equals(valor) || ",".equals(valor)) 
				&& !(valor.contains(",") || valor.contains(".")))
			return TipoComando.VIRGULA;		
		if("±".equals(valor))
			return TipoComando.SINAL;
		

		
		return null;
	}
	
	private boolean isNumber(String text) {
		try {
			Integer.parseInt(text);
			return true;
		} catch (Exception e) {
			return false;
		}			
	}
	

}
