package com.minami.aula1.loiane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Utils {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6859536048028109605L;

	public void printHelloWorld() {
		System.out.println("alo mundo");
	}
	
	public void printNumberArray(int numero) {
		System.out.println("O número informado foi " + numero);
	}
	
	private int sumNumbersArray(int[] numbers) {
		int sumOfNumbers = 0;
		for(int i = 0; i < numbers.length; i++) {
			sumOfNumbers += numbers[i];
		}
		return sumOfNumbers;
	}
	
	private int[] readInputIntegerNumbers() throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers to be summed, separeted by commas, without spaces");
	    String[] answer = in.next().split(",");
	    int[] numbers = new int[answer.length];
	    
	    for(int i = 0; i < answer.length; i++) {
	    	numbers[i] = Integer.parseInt(answer[i]);	
	    }
	    
	    in.close();
	    
	    return numbers; 
	}
	
	
	private List<String> readInputDoubleNumbersGenerics() throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers to be summed, separeted by commas, without spaces");
	    String[] answer = in.next().split(",");
	    List<String> answerList = Arrays.asList(answer);

	    return answerList; 
	} 
	
	private List<? extends Number> convertStringToNumber(List<String> stringNumbers){
		List<? extends Number> numbersList = new ArrayList<Number>();
		for(String stringNumber:stringNumbers) {
			numbersList.add(7.0);
		}
		return numbersList;
	}
	
	private double[] readInputDoubleNumbers() throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers to be summed, separeted by commas, without spaces");
	    String[] answer = in.next().split(",");
	    double[] numbers = new double[answer.length];
	    
	    for(int i = 0; i < answer.length; i++) {
	    	numbers[i] = Double.parseDouble(answer[i]);	
	    }
	    
	    in.close();
	    
	    return numbers; 
	}
	public void sumNumbers() throws Exception {
		int[] numbers = readInputIntegerNumbers();
		System.out.println("o Total é " + sumNumbersArray(numbers));
	}
	
	public void averageNumber() throws Exception{
		double[] numbers = readInputDoubleNumbers();
		System.out.println("o total e " + sumNumbersDoubleArray(numbers)/numbers.length);
	}
	
	private double sumNumbersDoubleArray(double[] numbers) {
		double sumOfNumbers = 0;
		for(int i = 0; i < numbers.length; i++) {
			sumOfNumbers += numbers[i];
		}
		return sumOfNumbers;
	}
	
}
