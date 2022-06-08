package com.bispo.aula.interfacE;

public interface Piloto {

	default String correr() {
		return "Piloto correndo";
	}
	
}
