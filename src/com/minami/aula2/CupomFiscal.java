package com.minami.aula2;

import java.text.DecimalFormat;

public class CupomFiscal {
	private String produto;
	private Double quantidade;
	private Double precoUnitario;
	private Double precoTotal;
	private Double valorDesconto;
	private Double valorAPagar;
	private DecimalFormat nf = new DecimalFormat("#,##0.00");
	
	CupomFiscal (String produto, Double quantidade, Double precoUnitario, Double precoTotal, Double valorDesconto, Double valorAPagar){
		this.produto = produto;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.precoTotal = precoTotal;
		this.valorDesconto = valorDesconto;
		this.valorAPagar = valorAPagar;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}	
	public Double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public Double getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public Double getValorAPagar() {
		return valorAPagar;
	}
	public void setValorAPagar(Double valorAPagar) {
		this.valorAPagar = valorAPagar;
	}

	@Override
	public String toString() {
		return "CupomFiscal [produto=" + produto + " | quantidade=" + quantidade + " | precoUnitario="+ nf.format(precoUnitario) + " | precoTotal=" + nf.format(precoTotal)
				+ " | valorDesconto=" + nf.format(valorDesconto) + " | valorAPagar=" + nf.format(valorAPagar) + "]";
	}
	
	
}
