package com.minami.game;

import java.util.Random;

import com.minami.type.Operacao;

public class MagicNumber {

	public static int sortearNumero() {
		return (int) (Math.random() * 6 + 1);
	}
	
	public static Operacao sortearOperacao() {
		return Operacao.values()[new Random().nextInt(Operacao.values().length)];
	}
	
	public static int calcularOperacao(int numero1, int numero2, Operacao operacao) {
		double resultado = 0;
		if (operacao.equals(Operacao.Divisao)) {
			resultado = numero1 / numero2;			
		} else if (operacao.equals(Operacao.Multiplicacao)) {
			resultado = numero1 * numero2;
		} else if (operacao.equals(Operacao.Soma)) {
			resultado = numero1 + numero2;
		} else if (operacao.equals(Operacao.Subtracao)) {
			resultado = numero1 - numero2;
		} else {
			resultado = 0;
		}
		//System.out.println(numero1 + " "  + operacao.getOperador() + " " + numero2 + " = " + resultado);
		return validarResultado(resultado);
	}
	
	public static int validarResultado(double resultado) {
		if (resultado < 0) {
			return (int)resultado * -1;
		} else {
			if ((resultado % 1) == 0) {
				return (int)resultado;
			} else {
				return -1;
			}
		} 
			
	}

}
