package com.minami.type;

import java.util.stream.Stream;

public enum RespostaSimNao {
	Sim,
	N�o,
	Nao,
	S,
	N;
	
	public static Stream<RespostaSimNao> stream() {
        return Stream.of(RespostaSimNao.values()); 
    }
}
