package com.bispo.aula.factory;

/**
 * Factory
 * @author negol
 *
 */
public class Categoria {

	public Produto getNovoProduto() {
		return new ProdutoFisico();
	}
	
}
