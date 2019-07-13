package com.minami.type;

public enum Operacao {
	Soma ("+"),
	Subtracao ("-"),
	Multiplicacao ("X"),
	Divisao ("/");

	public String operador;
	
	Operacao(String operador){
		this.operador = operador;
	}
	
	public String getOperador() {
		return this.operador;
	}
	
}
