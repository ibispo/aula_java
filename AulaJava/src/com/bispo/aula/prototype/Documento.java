package com.bispo.aula.prototype;

/*
 * Não permitir que sejam feitas subclasses por problemas com Clone
 * -------------
 * 
 * "Java Efetivo" --- 1 capitulo para não usar o clone 
 * Joshal Block 
 *       --- Usar constructor para criar o clone
 *  
 *  
 */

final class Documento implements Cloneable {

	String nome;
	String tipo;
	String visibilidade;
	String localizacao;   // url, path, etc....
	
	// Documento doc ---- PROBLEMA DO CLONE (POIS ELE CLONARIA A REFERENCIA)
	
	
	@Override
	protected Documento clone() throws CloneNotSupportedException {
		return (Documento) super.clone();
	}

	@Override
	public String toString() {
		return "Documento [nome=" + nome + ", tipo=" + tipo + ", visibilidade=" + visibilidade + ", localizacao="
				+ localizacao + "]";
	}
	
}
