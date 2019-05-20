package com.minami.type;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoTipoCarne implements Produto {
	TipoCarne tipoCarne;
	
	ProdutoTipoCarne (TipoCarne tipoCarne){
		this.tipoCarne = tipoCarne;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		
		return tipoCarne.name();
	}

	@Override
	public Double getValorUnitario(Double quantidade) {
		
		List<PrecoCarne> precoCarne = PrecoCarne.stream()
				.filter(d -> d.name().contains(tipoCarne.name()))
				.collect(Collectors.toList());
		
		if (quantidade <= 5 ) {
			return precoCarne.stream().filter(d -> d.name().contains("Ate5Kg")).mapToDouble(d -> d.getPreco()).sum();
		} else {
			return precoCarne.stream().filter(d -> d.name().contains("Acima5Kg")).mapToDouble(d -> d.getPreco()).sum();

	}



	@Override
	public Double getValorDesconto(String nome, Double quantidade, boolean isCartaoTabajara) {
		// TODO Auto-generated method stub
		return null;
	}
}