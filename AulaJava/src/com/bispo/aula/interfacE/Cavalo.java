package com.bispo.aula.interfacE;

public class Cavalo implements Corredor {

	@Override
	public String correrRapido() {
		return "Galopando rapido";
	}
	
	@Override
	public String correr() {
		return "Galopando";
	}

}
