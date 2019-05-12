package com.minami.type;

import java.util.stream.Stream;

public enum TipoCarne {
	FileDuplo("File Duplo"),
	Alcatra("Alcatra"),
	Picanha("Picanha");
	
	public String tipoCarne;
	
	TipoCarne(String tipoCarne){
		this.tipoCarne = tipoCarne;
	}
	
	public static Stream<TipoCarne> stream() {
        return Stream.of(TipoCarne.values()); 
    }
}
