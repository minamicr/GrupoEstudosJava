package com.minami.type;

import java.util.stream.Stream;

public enum RespostaSimNao {
	SIM ("SIM", true),
	NÃO ("NÃO", false),
	NAO ("NAO", false),
	S ("S", true),
	N ("N", false);
	
	public String resposta;
	public boolean booleanValue;
	
	RespostaSimNao(String resposta, boolean booleanValue){
		this.resposta = resposta;
		this.booleanValue = booleanValue;
	}
	
	public String getResposta() {
		return this.resposta;
	}
	
	
	public boolean getBooleanValue() {
		return this.booleanValue;
	}
	
	public static Stream<RespostaSimNao> stream() {
        return Stream.of(RespostaSimNao.values()); 
    }
}
