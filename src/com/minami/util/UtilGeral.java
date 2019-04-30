package com.minami.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UtilGeral {
	public List<String> readInput(String message) throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println(message);
	    String[] answer = in.next().split(",");
	    List<String> answerList = Arrays.asList(answer);
	    in.close();
	    return answerList; 
	} 
	
	public List<? extends Number> convertStringToNumber(List<String> stringNumbers){
		List<Double> numbersList = new ArrayList<Double>();
		for(String stringNumber:stringNumbers) {
			numbersList.add(Double.parseDouble(stringNumber));
		}
		return numbersList;
	}
	

}
