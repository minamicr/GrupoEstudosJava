package com.minami.model;

public class PopulacaoModel {
	private Integer quantidadeHabitantes;
	private Double percentualCrescimento;
	
	public PopulacaoModel (Integer quantidadeHabitantes, Double percentualCrescimento) {
		this.quantidadeHabitantes = quantidadeHabitantes;
		this.percentualCrescimento = percentualCrescimento;
	}
	
	public Integer getQuantidadeHabitantes() {
		return quantidadeHabitantes;
	}
	public void setQuantidadeHabitantes(Integer quantidadeHabitantes) {
		this.quantidadeHabitantes = quantidadeHabitantes;
	}
	public Double getPercentualCrescimento() {
		return percentualCrescimento;
	}
	public void setPercentualCrescimento(Double percentualCrescimento) {
		this.percentualCrescimento = percentualCrescimento;
	}
	
	
}
