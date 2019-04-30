package com.minami.aula2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.minami.util.UtilGeral;

public class Utils2 extends UtilGeral {

	// peça dois números e imprima o maior deles
	public double returnBiggestNumber(List<? extends Number> numbers) {
		double biggestNumber = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if ( biggestNumber < (double)numbers.get(i)) {
				biggestNumber = (double)numbers.get(i);
			}
		}
		return biggestNumber;
	}
	
	public String showSexType(List<String> listValues) {
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
	
	public String verifyStringType(List<String> listValues) {
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
	
}
