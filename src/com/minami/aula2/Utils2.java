package com.minami.aula2;

import java.util.List;
import java.util.Optional;

import com.minami.type.RespostaSimNao;
import com.minami.type.TipoCarne;
import com.minami.util.UtilGeral;

public class Utils2 extends UtilGeral {

	// pe�a dois n�meros e imprima o maior deles
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
					result += ", " + valueUpperCase + " - " + "Sexo Inv�lido";
			}
		}
		return result.substring(1);  //exclui primeira virgula da string

	}
	
	public static String verifyStringType(List<String> listValues) {
		String result = "";
		
		for (String value : listValues) {
			Character character = value.charAt(0);
			if (Character.isDigit(character)) {
				result += ", " + value + " - " + "� um n�mero";
			} else if (Character.isLetter(character)) {
				result += ", " + value + " - " + "� uma letra";
			} else {
				result += ", " + value + " - " + "n�o � n�mero nem letra";
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
		Optional<TipoCarne> tipoCarneEncontrado = TipoCarne.stream()
        	.filter(d -> d.tipoCarne.equals(tipoCarne))
        	.findFirst();
		
		if (tipoCarneEncontrado.isPresent()) {
			return tipoCarneEncontrado.get();
		} else {
			throw new Exception("N�o foi informado um tipo de carne v�lido !");
		}
		
	}
	
	public static Double convertToDouble(String valor) throws Exception {
		if (Double.parseDouble(valor) > 0) {
			return Double.parseDouble(valor);
		} else {
			throw new Exception("N�o foi informada uma quantide em quilos v�lida !");
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
				case N�o:
					return false;
				case Nao:
					return false;
				case S:
					return true;
				case Sim:
					return true;
				default:
					throw new Exception("N�o foi informada uma resposta v�lida para a utiliza��o do cart�o Tabajara !");
			}
		} else {
			throw new Exception("N�o foi informada uma resposta v�lida para a utiliza��o do cart�o Tabajara !");
		}
	}
	
	public static CupomFiscal gerarCupomFiscal(TipoCarne tipoCarne, Double quantidade, boolean isCartaoTabajara) {
		return null;
	}
	
	public static void imprimirCupomFiscal(CupomFiscal cupomFiscal) {
		
	}
}
