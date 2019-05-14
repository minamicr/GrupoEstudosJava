package com.minami.aula2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.minami.type.PrecoCarne;
import com.minami.type.RespostaSimNao;
import com.minami.type.TipoCarne;
import com.minami.util.UtilGeral;

public class Utils2 extends UtilGeral {

	// peça dois números e imprima o maior deles
	public static double returnBiggestNumber(List<? extends Number> numbers) {
		double biggestNumber = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if ( biggestNumber < (double)numbers.get(i)) {
				biggestNumber = (double)numbers.get(i);
			}
		}
		return biggestNumber;
	}
	
	public static String showSexType(List<String> listValues) {
		String result = "";
		
		for (String value : listValues) {
			String valueUpperCase = value.toUpperCase();
			
			switch (valueUpperCase) {
				case "F":
					result += ", " + valueUpperCase + " - " + "Feminino";
					break;
				case "M":
					result += ", " + valueUpperCase + " - " + "Masculino";
					break;
				default:
					result += ", " + valueUpperCase + " - " + "Sexo Inválido";
			}
		}
		return result.substring(1);  //exclui primeira virgula da string

	}
	
	public static String verifyStringType(List<String> listValues) {
		String result = "";
		
		for (String value : listValues) {
			Character character = value.charAt(0);
			if (Character.isDigit(character)) {
				result += ", " + value + " - " + "é um número";
			} else if (Character.isLetter(character)) {
				result += ", " + value + " - " + "é uma letra";
			} else {
				result += ", " + value + " - " + "não é número nem letra";
			}
		}
		return result.substring(1);  //exclui primeira virgula da string
		
	}
	
	public static double getPercentualReajusteSalario(double salario) {
		if (salario <= 280) {
			return 0.20;
		} else if (salario > 280 && salario < 700 ) {
			return 0.15;
		} else if (salario >= 700 && salario < 1500) {
			return 0.10;
		} else {
			return 0.05;
		}
		
	}
	
	public static String formataPercentual(double valor) throws Exception {
		return String.valueOf(valor * 100) + "%";
	}
	
	public static TipoCarne convertToTipoCarne(String tipoCarne) throws Exception {
		return TipoCarne.stream()
        	.filter(d -> d.tipoCarne.equals(tipoCarne))
        	.findFirst()
        	.orElseThrow(IllegalArgumentException::new);
		
		/* 
		if (tipoCarneEncontrado.isPresent()) {
			return tipoCarneEncontrado.get();
		} else {
			throw new Exception("Não foi informado um tipo de carne válido !");
		}*/
		
	}
	
	public static Double convertToDouble(String valor) throws Exception {
		if (Double.parseDouble(valor) > 0) {
			return Double.parseDouble(valor);
		} else {
			throw new Exception("Não foi informada uma quantide em quilos válida !");
		}
	}
	
	public static boolean convertToBoolean(String resposta) throws Exception {
		Optional<RespostaSimNao> respostaEncontrada = RespostaSimNao.stream()
				.filter(d -> d.name().equals(resposta))
				.findFirst();
		
		if (respostaEncontrada.isPresent()) {
			switch(respostaEncontrada.get()) {
				case N:
					return false;
				case Não:
					return false;
				case Nao:
					return false;
				case S:
					return true;
				case Sim:
					return true;
				default:
					throw new Exception("Não foi informada uma resposta válida para a utilização do cartão Tabajara !");
			}
		} else {
			throw new Exception("Não foi informada uma resposta válida para a utilização do cartão Tabajara !");
		}
	}
	
	public static CupomFiscal gerarCupomFiscal(TipoCarne tipoCarne, Double quantidade, boolean isCartaoTabajara) {
		Double preco = getPrecoCarne(tipoCarne, quantidade);
		Double precoTotal = preco * quantidade;
		Double valorDesconto = 0.0;
		Double valorAPagar = 0.0;
		
		if (isCartaoTabajara) {
			valorDesconto = precoTotal * 0.05;
		}
		
		valorAPagar = precoTotal - valorDesconto;

		return new CupomFiscal(tipoCarne.name(),quantidade, precoTotal, valorDesconto, valorAPagar);
	}
	
	public static Double getPrecoCarne(TipoCarne tipoCarne, Double quantidade) {
		List<PrecoCarne> precoCarne = PrecoCarne.stream()
				.filter(d -> d.name().contains(tipoCarne.name()))
				.collect(Collectors.toList());
		
		if (quantidade <= 5 ) {
			return precoCarne.stream().filter(d -> d.name().contains("Ate5Kg")).mapToDouble(d -> d.getPreco()).sum();
		} else {
			return precoCarne.stream().filter(d -> d.name().contains("Acima5Kg")).mapToDouble(d -> d.getPreco()).sum();
		}
		
	}
	
	public static void imprimirCupomFiscal(CupomFiscal cupomFiscal) {
		System.err.println(cupomFiscal.toString());
	}
}
