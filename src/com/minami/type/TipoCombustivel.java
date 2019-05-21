package com.minami.type;

import java.util.stream.Stream;

public enum TipoCombustivel {
	Alcool ("ALCOOL", 1.90),
	Gasolina ("GASOLINA", 2.50);
	
	String tipoCombustivel;
	Double preco;
	
	TipoCombustivel(String tipoCombustivel, Double preco){
		this.tipoCombustivel = tipoCombustivel;
		this.preco = preco;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public static Stream<TipoCombustivel> stream() {
        return Stream.of(TipoCombustivel.values()); 
    }
}
