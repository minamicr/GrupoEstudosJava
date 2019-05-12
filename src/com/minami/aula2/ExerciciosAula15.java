package com.minami.aula2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

import com.minami.aula1.loiane.Utils;
import com.minami.type.TipoCarne;

public class ExerciciosAula15 {
	static DecimalFormat formataMoeda = new DecimalFormat("#,##0.00");
	
	public static void main(String[] args) throws Exception{
		imprimeInformacoesSalario();
	}
	
	private static void returnBiggestNumber() throws Exception{
		List<String> listNumbers = Utils2.readInput("Para obter o maior número, entre com os números separados por vírgula, sem espaços");
		System.out.println("O maior número é " + Utils2.returnBiggestNumber(Utils2.convertStringToNumber(listNumbers)));
	}
	
	private static void showSexType() throws Exception{
		List<String> listSex = Utils2.readInput("Informe as letras separadas por vírgulas");
		System.out.println(Utils2.showSexType(listSex));
	}
	
	private static void verifyStringType() throws Exception{
		List<String> listCharacters = Utils2.readInput("Informe as letras separadas por vírgulas");
		System.out.println(Utils2.verifyStringType(listCharacters));
	}
	
	private static void imprimeInformacoesSalario() throws Exception{
		//salario, perc, vl aument, novo sal
		String salarioInformado = Utils2.readOneInput("Informe o valor do salário");
		double salario = Double.parseDouble(salarioInformado);
		double percentualReajuste = Utils2.getPercentualReajusteSalario(salario);
		double valorReajuste = salario * percentualReajuste;
		double salarioReajustado = salario + valorReajuste;
		
		System.out.println("Salario informado " + formataMoeda.format(salario) 
			+ ", percentual reajuste " + Utils2.formataPercentual(percentualReajuste)
			+ ", valor aumento " + formataMoeda.format(valorReajuste)
			+ ", novo salário " + formataMoeda.format(salarioReajustado));
		
	}
	
	private static void imprimirCupomFiscal() throws Exception{
		String tipoCarneInput = Utils2.readOneInput("Informe o tipo de carne (FileDuplo, Alcatra, Picanha");
		String quantidadeInput = Utils2.readOneInput("Quantos quilos de carne deseja comprar ?");
		String isCartaoTabajaraInput = Utils2.readOneInput("Você pagará com o cartão Tabajara ? (s / n)");
		
		TipoCarne tipoCarne = Utils2.convertToTipoCarne(tipoCarneInput);
		Double quantidade = Utils2.convertToDouble(quantidadeInput);
		boolean isCartaoTabajara = Utils2.convertToBoolean(isCartaoTabajaraInput);
		
		CupomFiscal cupomFiscal = Utils2.gerarCupomFiscal(tipoCarne, quantidade, isCartaoTabajara);
		
		Utils2.imprimirCupomFiscal(cupomFiscal);

	}
	
}
