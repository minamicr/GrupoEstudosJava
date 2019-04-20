package com.minami.aula1;

public class MeusDados {

	
	public static void main(String[] args) {

		inicializarMeusDados();
	}
	
	private static void inicializarMeusDados() {
		String nome = "Cristina";
		int idade = 44;
		double altura = 1.56;
		boolean gostoDeJava = true;
		
		imprimirDados(nome, idade, altura, gostoDeJava);
	}
	
	private static void imprimirDados(String nome, int idade, double altura, boolean gostoDeJava) {
		System.out.println("Meu nome � " + nome);
		System.out.println("Minha idade � " + idade);
		System.out.println("Minha altura � " + altura);
		System.out.println("Eu gosto de Java " + gostoDeJava);
	}

}
