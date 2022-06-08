package com.bispo.aula.interfacE;

@FunctionalInterface
public interface Corredor {

	static double calculeVelocidade(int i, int j) {

		double retorno = i/j;
		
		return retorno;
	}

	default String correr() {
		return "Corrend�o....";  // buscaDescCorrer();
	}
	
	// Somente JAVA 11 (m�todos "private static" dentro de interface) 
//	private static String buscaDescCorrer() {
//		return "C.o.r.r.e.n.d.o....";
//	}
	
	String correrRapido();
	
}
