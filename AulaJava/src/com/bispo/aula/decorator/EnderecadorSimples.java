package com.bispo.aula.decorator;

public class EnderecadorSimples implements Enderecador {

	@Override
	public String preparandereco(Endereco ender) {

		StringBuilder ret = new StringBuilder(ender.logradouro);
		
		ret.append("\n")
			.append(ender.bairro)
			.append("\n")
			.append(ender.cidade)
			.append('/')
			.append(ender.uf)
			.append("\n")
			.append(ender.cep);
		
		
		return ret.toString();
	}

}
