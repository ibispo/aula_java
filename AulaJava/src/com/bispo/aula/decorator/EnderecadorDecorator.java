package com.bispo.aula.decorator;

public abstract class EnderecadorDecorator implements Enderecador {

	Enderecador ender;
	
	public EnderecadorDecorator(Enderecador ender) {
		super();
		this.ender = ender;
	}
	
}
