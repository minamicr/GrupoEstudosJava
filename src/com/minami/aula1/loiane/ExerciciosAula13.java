package com.minami.aula1.loiane;

import java.util.List;

public class ExerciciosAula13 {
	private static Utils utils = new Utils();
	
	public static void main (String[] args) throws Exception{
		sumOfNumbers();
		
	}
	
	private static void printHelloWorld() {
		// Imprime hello world
		utils.printHelloWorld();
	}
	
	private static void printNumber() {
		// Imprime número
		utils.printNumberArray(8);
	}
	
	private static void sumOfNumbers() throws Exception{
		// Recebe input de números e faz a soma
		List<String> listNumbers = utils.readInput("Informe os números a serem somados, separdos por vírgulas e sem espaços");
		System.out.println("Valor total "+ utils.sumNumbersDoubleArray(utils.convertStringToNumber(listNumbers)));

	}
}
