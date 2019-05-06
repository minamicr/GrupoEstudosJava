package com.minami.aula2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

import com.minami.aula1.loiane.Utils;

public class ExerciciosAula15 {
	DecimalFormat formataNumero = new DecimalFormat("#.##0,00");
	
	public static void main(String[] args) throws Exception{
		verifyStringType();
	}
	
	private static void returnBiggestNumber() throws Exception{
		List<String> listNumbers = Utils2.readInput("Para obter o maior n�mero, entre com os n�meros separados por v�rgula, sem espa�os");
		System.out.println("O maior n�mero � " + Utils2.returnBiggestNumber(Utils2.convertStringToNumber(listNumbers)));
	}
	
	private static void showSexType() throws Exception{
		List<String> listSex = Utils2.readInput("Informe as letras separadas por v�rgulas");
		System.out.println(Utils2.showSexType(listSex));
	}
	
	private static void verifyStringType() throws Exception{
		List<String> listCharacters = Utils2.readInput("Informe as letras separadas por v�rgulas");
		System.out.println(Utils2.verifyStringType(listCharacters));
	}
	
	private static void imprimeInformacoesSalario() throws Exception{
		//salario, perc, vl aument, novo sal
		String salarioInformado = Utils2.readInput("Informe o valor do sal�rio");
		double salario = Double.parseDouble(salarioInformado);
		double valorReajuste = Utils2.getPercentualReajusteSalario(salario);
		
		System.out.println("Salario informado " + formataNumero.format(salario) );
		
	}
	
	
}
