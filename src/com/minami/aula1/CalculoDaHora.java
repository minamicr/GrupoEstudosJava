package com.minami.aula1;

public class CalculoDaHora {

	public static void main(String[] args) {
		double salario = 2500;
		int horasSemana = 40;
		int quantidadeSemanasMes = 4;
		double valorDaHora = 0;
		
		
		valorDaHora = calcularValorDaHora(salario, calcularTotalHorasMes(horasSemana, quantidadeSemanasMes));
		
		System.out.println("O valor da hora de trabalho de maria é " + valorDaHora);
		
	}
	
	private static int calcularTotalHorasMes(int horasSemana, int quantidadeSemanasMes) {
		return horasSemana * quantidadeSemanasMes;
	}
	
	private static double calcularValorDaHora(double salario, int totalHorasMes) {
		return salario / (double) totalHorasMes;	
	}
	
	
}
