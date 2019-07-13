package com.minami.game;

import com.minami.type.Operacao;

public class main {

	public static void main(String[] args) {
		int[] contadorResultado = new int[217];

		for(int i = 0; i < 100000000; i++) {
			calcularResultado(contadorResultado);
		}
		
		for(int i = 0; i < contadorResultado.length; i++) {
			if (contadorResultado[i] != 0) {
				System.out.println(i + " " + contadorResultado[i]);
			}
		}
		
	}
	
	private static void calcularResultado(int[] contadorResultado) {
		int dado1 = MagicNumber.sortearNumero();
		int dado2 = MagicNumber.sortearNumero();
		int dado3 = MagicNumber.sortearNumero();
		Operacao operacao1 = MagicNumber.sortearOperacao();
		Operacao operacao2 = MagicNumber.sortearOperacao();
		
		int resultado1 = MagicNumber.calcularOperacao(dado1, dado2, operacao1);
		int resultado2 = MagicNumber.calcularOperacao(resultado1, dado3, operacao2);
		
		if(resultado1 != -1 && resultado2 != -1) {
			contadorResultado[resultado2] = contadorResultado[resultado2] + 1;
		}
	}
	
}

//sortear 3 dados
//sortear 2 operações
//maior numero 6 X 6 X 6
//se resultado < 0, multiplica por -1
//se resultado quebrado, descarta
//resultado somar 1 no vetor para verificar qtde. de repetições