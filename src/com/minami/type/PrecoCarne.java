package com.minami.type;

public enum PrecoCarne {
	FileDuploAte5Kg(4.9),
	FileDuploAcima5Kg(5.8),
	AlcatraAte5Kg(5.9),
	AlcatraAcima5Kg(6.8),
	PicanhaAte5Kg(6.9),
	PicanhaAcima5Kg(7.8);
	
	private double preco;
	
	PrecoCarne(double preco){
		this.preco = preco;
	}

	public double getPreco(){
		return this.preco;
	}

}
