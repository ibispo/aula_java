package com.bispo.aula.interfacE;

@FunctionalInterface
public interface Corredor {

	static double calculeVelocidade(int i, int j) {

		double retorno = i/j;
		
		return retorno;
	}

	default String correr() {
		return "Correndão....";  // buscaDescCorrer();
	}
	
	// Somente JAVA 11 (métodos "private static" dentro de interface) 
//	private static String buscaDescCorrer() {
//		return "C.o.r.r.e.n.d.o....";
//	}
	
	String correrRapido();
	
}
