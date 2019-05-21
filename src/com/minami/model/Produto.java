package com.minami.model;

public interface Produto {

	public String getNome();
	public Double getValorUnitario(Double quantidade);
	public Double getValorDesconto();
}
