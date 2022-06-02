package com.bispo.aula.factory;

import java.util.Calendar;

public class AulaFactory {

	// Virtual Constructor (nome alternativo para Factory Method)
	
	public static void main(String[] args) {

		// Static Factory Methods
		Calendar.getInstance();
		Integer.valueOf("1234");
		
		// Exemplo de Factoty completo
		// javax.xml.parsers.DocumentBuilderFactory.DocumentBuilderFactory

		
		// Categoria
		CategoriaFactory catFac = new CategoriaFactory();
		Produto prod = catFac.getNovoProduto(4);
		prod.tipoProduto();
	
		
		
		
		
		
		
	}
	
	
}
