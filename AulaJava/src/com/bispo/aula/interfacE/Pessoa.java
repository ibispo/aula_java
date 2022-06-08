package com.bispo.aula.interfacE;

public class Pessoa implements Corredor, Piloto {

	@Override
	public String correrRapido() {
		return "Correndo rápido";
	}

	@Override
	public String correr() {
		return Piloto.super.correr();
	}
	
	
}
