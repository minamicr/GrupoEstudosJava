package com.minami.type;

public interface Produto {

	public String getNome();
	public Double getValorUnitario(Double quantidade);
	public Double getValorDesconto(String nome, Double quantidade, boolean isCartaoTabajara);
}
