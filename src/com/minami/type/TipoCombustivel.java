package com.minami.type;

public enum TipoCombustivel {
	ALCOOL ("Alcool", 1.90),
	GASOLINA ("Gasolina", 2.50);
	
	String tipoCombustivel;
	Double preco;
	
	TipoCombustivel(String tipoCombustivel, Double preco){
		this.tipoCombustivel = tipoCombustivel;
		this.preco = preco;
	}
	
	public Double getPreco() {
		return preco;
	}

	public String getTipoCombustivel () {
		return tipoCombustivel;
	}
}
