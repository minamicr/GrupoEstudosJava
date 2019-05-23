package com.minami.aula3;

import com.minami.model.PopulacaoModel;
import com.minami.type.Populacao;

public class Utils3 {
	
	public static Integer calcularQtdeAnosCrescimento() {
		Populacao parametrosA = Populacao.stream()
								.filter(populacao -> populacao.name().contains("A"))
								.findAny()
								.orElseThrow(() -> new IllegalArgumentException("N�o foi informado um tipo de carne v�lido !"));
		
		Populacao parametrosB = Populacao.stream()
				.filter(populacao -> populacao.name().contains("B"))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException("N�o foi informado um tipo de carne v�lido !"));
		
		PopulacaoModel populacaoA = new PopulacaoModel(parametrosA.getQuantidadeHabitantes(), parametrosA.getPercentualCrescimento());
		PopulacaoModel populacaoB = new PopulacaoModel(parametrosB.getQuantidadeHabitantes(), parametrosB.getPercentualCrescimento());
		
		Double qtdeCrescimentoA = 0.0;
		Double qtdeCrescimentoB = 0.0;
		Integer totalA = 0;
		Integer totalB = 0;
		int qtdeAnos = 0;
		
		while (populacaoA.getQuantidadeHabitantes() < populacaoB.getQuantidadeHabitantes()) {
			qtdeCrescimentoA = populacaoA.getQuantidadeHabitantes() * populacaoA.getPercentualCrescimento();
			totalA = populacaoA.getQuantidadeHabitantes() + Integer.valueOf(qtdeCrescimentoA.intValue());
			populacaoA.setQuantidadeHabitantes(totalA);
			
			qtdeCrescimentoB = populacaoB.getQuantidadeHabitantes() * populacaoB.getPercentualCrescimento();
			totalB = populacaoB.getQuantidadeHabitantes() + Integer.valueOf(qtdeCrescimentoB.intValue());
			populacaoB.setQuantidadeHabitantes(totalB);
			
			qtdeAnos ++;
		}
		
		return qtdeAnos;
	}
}
