package com.minami.aula1.loiane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.minami.util.UtilGeral;

public class Utils extends UtilGeral{

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
		

	public double sumNumbersDoubleArray(List<? extends Number> numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += (double)numbers.get(i);
		}
		return sum;
	}


}
