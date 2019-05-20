package com.minami.aula2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.minami.constants.Constants;
import com.minami.type.PrecoCarne;
import com.minami.type.Produto;
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
        	.filter(d -> d.tipoCarne.equals(tipoCarne.toUpperCase()))
        	.findFirst()
        	.orElseThrow(() -> new IllegalArgumentException("Não foi informado um tipo de carne válido !"));
	}
	
	public static Double convertToDouble(String valor) throws Exception {
		if (Double.parseDouble(valor) > 0) {
			return Double.parseDouble(valor);
		} else {
			throw new Exception("Não foi informada uma quantide em quilos válida !");
		}
	}
	
	public static RespostaSimNao convertToBoolean(String resposta) throws Exception {

		return RespostaSimNao.stream()
				.filter(d -> d.getResposta().equals(resposta.toUpperCase()))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Não foi informada uma resposta válida para o cartão Tabajara!"));
	}
	
	private Double getDescontoCartaoTabajara(boolean isCartaoTabajara) {
		if (isCartaoTabajara) {
			return Constants.ValorDescontoCartaoTabajara;
		} else {
			return 0.0;
		}
	}
	
	public static CupomFiscal gerarCupomFiscal(Produto produto, Double quantidade, Double percentualDesconto) {
		Double valorUnitario = produto.getValorUnitario(quantidade); 
		Double valorTotal = valorUnitario * quantidade;
		Double valorDesconto = 0.0;
		Double valorAPagar = 0.0;
		
		valorDesconto = (percentualDesconto > 0 ? valorTotal * percentualDesconto : 0);
		
		valorAPagar = valorTotal - valorDesconto;

		return new CupomFiscal(produto.getNome(), quantidade, valorUnitario, valorTotal, percentualDesconto, valorDesconto, valorAPagar);

		
	}
	
	public static void imprimirCupomFiscal(CupomFiscal cupomFiscal) {
		System.err.println(cupomFiscal.toString());
	}
}
