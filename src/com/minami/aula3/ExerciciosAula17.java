package com.minami.aula3;

public class ExerciciosAula17 {

	public static void main(String[] args) throws Exception {
		//System.out.println(Utils3.calcularQtdeAnosCrescimento() + " anos");
		imprimirTabuada();
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
}
