package com.minami.aula3;

public class ExerciciosAula17 {

	public static void main(String[] args) throws Exception {
		//System.out.println(Utils3.calcularQtdeAnosCrescimento() + " anos");
		//imprimirTabuada();
		//imprimirPotenciacao();
		calcularFatorial();
	}
	
	private static void imprimirTabuada() throws Exception {
		String coeficienteBaseStr = Utils3.readOneInput("Informe o coeficiente base da multiplicação:");
		String coeficienteMaximoStr = Utils3.readOneInput("Informe o coeficiente máximo da multiplicação:");
		
		Integer coeficienteBase = Integer.parseInt(coeficienteBaseStr);
		Integer coeficienteMaximo = Integer.parseInt(coeficienteMaximoStr);
		Integer coeficienteAtual = 0;
		
		while (coeficienteAtual <= coeficienteMaximo) {
			System.out.println(coeficienteBase + " * " + coeficienteAtual + " = " + (coeficienteBase * coeficienteAtual));
			coeficienteAtual++;
		}	
		
	}
	
	private static void imprimirPotenciacao() throws Exception {
		String baseStr = Utils3.readOneInput("Informe o número base da potenciação:");
		String expoenteStr = Utils3.readOneInput("Informe o expoente da potenciação:");
		
		Integer base = Integer.parseInt(baseStr);
		Integer expoente = Integer.parseInt(expoenteStr);
		Integer expoenteAtual = 1;
		Integer resultado = base;
		
		while (expoenteAtual < expoente) {
			resultado = resultado * base;
			expoenteAtual ++;
		}
		
		System.out.println("Potência de " + base + " elevado a " + expoenteStr + " = " + resultado);
	}
	
	private static void calcularFatorial() throws Exception {
		String fatorialStr = Utils3.readOneInput("Informe o número para cálculo do fatorial:");
		
		Integer numeroFatorial = Integer.parseInt(fatorialStr);
		System.out.println("Fatorial de " + numeroFatorial + " = " + Utils3.fatorial(numeroFatorial));
		
	}
}
