package com.bispo.aula.decorator;

public class EnderecadorCaixaAlta extends EnderecadorDecorator {

	public EnderecadorCaixaAlta(Enderecador ender) {
		super(ender);
	}

	@Override
	public String preparandereco(Endereco ender) {
		return this.ender.preparandereco(ender).toUpperCase();
	}

	
}
