package com.bispo.aula.singleton;

public class AulaSingleton {

	public static void main(String[] args) {
	
	//	ProdutoFactory.INSTANCE.novoProduto(4);
	
		ProdutoFactory.getInstance().novoProduto(1);
		
	}
	
}

interface Produto4 {
	
}

class ProdutoPadrao4 implements Produto4  {
	
}

class ProdutoDigital14 extends ProdutoPadrao4 {
	
}

class ProdutoFisico4 extends ProdutoPadrao4 {
	
}

//-------------------------------------------
// ProdutoFactory.java
class ProdutoFactory {

	// Constructor
	private ProdutoFactory() {
	}

	
	// 1º modelo --- Não LAZY
	// public static final ProdutoFactory INSTANCE = new ProdutoFactory();
	
	// 2º modelo --- LAZY
	// Problema: NÃO É THREAD-SAFE
	private static ProdutoFactory instance;
	public static synchronized /* <---- agora se torna thread-safe */ ProdutoFactory getInstance() {
		if (instance == null) {
			instance = new ProdutoFactory();
		}
		return instance;
	}
	
	
	
	public Produto4 novoProduto(int tipoProduto) {
		switch (tipoProduto) {
			case 1:
				return new ProdutoPadrao4();
			case 2:
				return new ProdutoDigital14();
			case 3:
				return new ProdutoFisico4();
			default:
				throw new IllegalArgumentException("Invalid product " + tipoProduto);
		}
	}
	
	
}









