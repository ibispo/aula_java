package com.bispo.aula.factory;

/**
 * Factory
 * @author negol
 *
 */
public class CategoriaDigital extends Categoria {

	@Override
	public Produto getNovoProduto() {
		return new ProdutoDigital();
	}
	
}
