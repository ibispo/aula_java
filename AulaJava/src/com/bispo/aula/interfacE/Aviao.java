package com.bispo.aula.interfacE;

public interface Aviao extends Corredor {

	/**
	 * Assinatura sobrescrita do metodo default super.correr (interface Corredor)
	 */
	@Override
	String correr();

	
	
}
