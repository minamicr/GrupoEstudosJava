package com.minami.model;

import java.util.List;
import java.util.stream.Collectors;

import com.minami.constants.Constants;
import com.minami.type.DescontoCombustivel;
import com.minami.type.TipoCombustivel;

public class ProdutoTipoCombustivel implements Produto{
	TipoCombustivel tipoCombustivel;
	Double quantidade;
	
	public ProdutoTipoCombustivel(TipoCombustivel tipoCombustivel, Double quantidade) {
		this.tipoCombustivel = tipoCombustivel;
		this.quantidade = quantidade;
	}
	@Override
	public String getNome() {
		return tipoCombustivel.getTipoCombustivel();
	}

	@Override
	public Double getValorUnitario(Double quantidade) {
		return tipoCombustivel.getPreco();
	}

	@Override
	public Double getValorDesconto() {
		List<DescontoCombustivel> descontoTipoCombustivel = DescontoCombustivel.stream()
					.filter(desconto -> desconto.name().contains(tipoCombustivel.name()))
					.collect(Collectors.toList());
		
		if (this.quantidade <= Constants.QuantidadeLitrosDesconto) {
			return descontoTipoCombustivel.stream().filter(desconto -> desconto.name().contains("Ate20Litros"))
					.mapToDouble(DescontoCombustivel::getDesconto)
					.min()
					.getAsDouble();
		} else {
			return descontoTipoCombustivel.stream().filter(desconto -> desconto.name().contains("Acima20Litros"))
					.mapToDouble(DescontoCombustivel::getDesconto)
					.min()
					.getAsDouble();
		}
		
	}

}
