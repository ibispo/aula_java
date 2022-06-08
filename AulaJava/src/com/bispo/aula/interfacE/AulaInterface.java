package com.bispo.aula.interfacE;

public class AulaInterface {

	public static void main(String[] args) {
		
		System.out.println(Corredor.calculeVelocidade(100,10));
		System.out.println(new Pessoa().correr());
		System.out.println(new Pessoa().correrRapido());
		
		System.out.println(new Cavalo().correr());
		
		
		
		new Carro(() -> "Vai")
			.mostra();
		
		
		
		// new Thread(() -> System.out.println("Olá")).run();
		
		
		
	}
	
	
}
