package com.minami.type;

import java.util.stream.Stream;

public enum TipoCarne {
	FileDuplo("FILE DUPLO"),
	Alcatra("ALCATRA"),
	Picanha("PICANHA");
	
	public String tipoCarne;
	
	TipoCarne(String tipoCarne){
		this.tipoCarne = tipoCarne;
	}
	
	public static Stream<TipoCarne> stream() {
        return Stream.of(TipoCarne.values()); 
    }
}
