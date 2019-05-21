package com.minami.model;

import java.util.List;
import java.util.stream.Collectors;

import com.minami.constants.Constants;
import com.minami.type.PrecoCarne;
import com.minami.type.TipoCarne;

public class ProdutoTipoCarne implements Produto {
	TipoCarne tipoCarne;
	boolean isCartaoTabajara;
	
	public ProdutoTipoCarne (TipoCarne tipoCarne, boolean isCartaoTabajara){
		this.tipoCarne = tipoCarne;
		this.isCartaoTabajara = isCartaoTabajara;
	}

	@Override
	public String getNome() {
		return tipoCarne.name();
	}

	@Override
	public Double getValorUnitario(Double quantidade) {
		List<PrecoCarne> precoCarne = PrecoCarne.stream()
				.filter(d -> d.name().contains(tipoCarne.name()))
				.collect(Collectors.toList());
		
		if (quantidade <= Constants.QuantidadeQuilosCarne)
		{
			return precoCarne.stream().filter(d -> d.name().contains("Ate5Kg"))
					.mapToDouble(carne -> carne.getPreco())
					.min()
					.getAsDouble();
		} else {
			return precoCarne.stream().filter(d -> d.name().contains("Acima5Kg"))
					.mapToDouble(carne -> carne.getPreco())
					.min()
					.getAsDouble();
		}
	
	}

	@Override
	public Double getValorDesconto() {
		if (this.isCartaoTabajara) {
			return Constants.ValorDescontoCartaoTabajara;
		} else {
			return 0.0;
		}
	}
}