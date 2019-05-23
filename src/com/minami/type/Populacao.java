package com.minami.type;

import java.util.stream.Stream;

public enum Populacao {
	PopulacaoA (80000, 0.03),
	PopulacaoB(200000, 0.015);
	
	Integer quantidadeHabitantes;
	Double percentualCrescimento;
	
	Populacao(Integer quantidadeHabitantes, Double percentualCrescimento){
		this.quantidadeHabitantes = quantidadeHabitantes;
		this.percentualCrescimento = percentualCrescimento;
	}
	
	public Integer getQuantidadeHabitantes() {
		return this.quantidadeHabitantes;
	}
	
	public Double getPercentualCrescimento() {
		return this.percentualCrescimento;
	}
	
	public static Stream<Populacao> stream() {
        return Stream.of(Populacao.values()); 
    }
}
