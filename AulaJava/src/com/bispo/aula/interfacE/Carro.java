package com.bispo.aula.interfacE;

public class Carro {

	private Corredor corredor;
	
	public Carro(Corredor corre) {
		this.corredor = corre;
	}

	public void mostra() {
		System.out.println(corredor.correrRapido());
	}
	
	
}
