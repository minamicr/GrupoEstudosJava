package com.minami.aula2;

import java.util.List;

import com.minami.aula1.loiane.Utils;

public class ExerciciosAula15 {

	private static Utils2 utils2 = new Utils2();
	
	public static void main(String[] args) throws Exception{
		verifyStringType();
	}
	
	private static void returnBiggestNumber() throws Exception{
		List<String> listNumbers = utils2.readInput("Para obter o maior número, entre com os números separados por vírgula, sem espaços");
		System.out.println("O maior número é " + utils2.returnBiggestNumber(utils2.convertStringToNumber(listNumbers)));
	}
	
	private static void showSexType() throws Exception{
		List<String> listSex = utils2.readInput("Informe as letras separadas por vírgulas");
		System.out.println(utils2.showSexType(listSex));
	}
	
	private static void verifyStringType() throws Exception{
		List<String> listCharacters = utils2.readInput("Informe as letras separadas por vírgulas");
		System.out.println(utils2.verifyStringType(listCharacters));
	}
}
