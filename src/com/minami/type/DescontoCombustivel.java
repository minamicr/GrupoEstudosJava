package com.minami.type;

import java.util.stream.Stream;

public enum DescontoCombustivel {
	GasolinaAte20Litros(0.04),
	GasolinaAcima20Litros(0.06),
	AlcoolAte20Litros(0.03),
	AlcoolAcima20Litros(0.05);
	
	private Double desconto;
	
	DescontoCombustivel(Double desconto) {
		this.desconto = desconto;
	}
	
	public double getDesconto(){
		return this.desconto;
	}
	
	public static Stream<DescontoCombustivel> stream() {
        return Stream.of(DescontoCombustivel.values()); 
    }
}
