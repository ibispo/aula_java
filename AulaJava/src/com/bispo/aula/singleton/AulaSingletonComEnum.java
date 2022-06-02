package com.bispo.aula.singleton;

public class AulaSingletonComEnum {

	public static void main(String[] args) {
	
	
		ProdutoFactoryEnum.INSTANCE.novoProduto(5);
		
	}
	
}

interface Produto5 {
	
}

class ProdutoPadrao5 implements Produto5  {
	
}

class ProdutoDigital15 extends ProdutoPadrao5 {
	
}

class ProdutoFisico5 extends ProdutoPadrao5 {
	
}

//-------------------------------------------
// ProdutoFactoryEnum.java
enum ProdutoFactoryEnum {

	INSTANCE;
	
	public Produto5 novoProduto(int tipoProduto) {
		switch (tipoProduto) {
			case 1:
				return new ProdutoPadrao5();
			case 2:
				return new ProdutoDigital15();
			case 3:
				return new ProdutoFisico5();
			default:
				throw new IllegalArgumentException("Invalid product " + tipoProduto);
		}
	}
	
	
}









