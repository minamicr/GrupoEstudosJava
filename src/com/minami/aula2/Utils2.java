package com.minami.aula2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.minami.util.UtilGeral;

public class Utils2 extends UtilGeral {

	// pe�a dois n�meros e imprima o maior deles
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
					result += ", " + valueUpperCase + " - " + "Sexo Inv�lido";
			}
		}
		return result.substring(1);  //exclui primeira virgula da string

	}
	
	public String verifyStringType(List<String> listValues) {
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
	
}
