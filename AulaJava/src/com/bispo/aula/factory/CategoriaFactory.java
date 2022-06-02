package com.bispo.aula.factory;

public class CategoriaFactory {

	
//	private String nome;
//	private Integer prioridade;
	
	public Produto getNovoProduto(int tipo) {
		
		switch (tipo) {
		case 1:
			return new ProdutoFisico();
		case 2:
			return new ProdutoDigital();
		default:
			throw new IllegalArgumentException();
		}
		
	}
	
	
}
