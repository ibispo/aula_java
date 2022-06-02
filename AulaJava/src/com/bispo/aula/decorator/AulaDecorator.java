package com.bispo.aula.decorator;

public class AulaDecorator {

	public static void main(String[] args) {
		
		Endereco ender = new Endereco("Rua Francisco Morato", "Vila Vianelo", "Jundiaí", "SP", "13207-250");
		
		Enderecador enderecador = new EnderecadorSimples();
		//enderecador = new EnderecadorCaixaAlta(enderecador);
		//enderecador = new EnderecadorComBorda(enderecador);
		
		System.out.println(enderecador.preparandereco(ender));
		
		
	}
	
}
