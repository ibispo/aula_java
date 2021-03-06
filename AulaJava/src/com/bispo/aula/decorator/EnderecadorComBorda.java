package com.bispo.aula.decorator;

public class EnderecadorComBorda extends EnderecadorDecorator {

	public EnderecadorComBorda(Enderecador ender) {
		super(ender);
	}
	
	@Override
	public String preparandereco(Endereco ender) {
		String descEnder = this.ender.preparandereco(ender);
		
		// Somente JAVA 11
//		descEnder.lines()
//			.map(l -> {
//				
//				return "|" + l;
//				
//			});
//		
		return descEnder;
	}


}
