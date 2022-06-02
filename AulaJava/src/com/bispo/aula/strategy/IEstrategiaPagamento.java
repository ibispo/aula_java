package com.bispo.aula.strategy;

import java.math.BigDecimal;

@FunctionalInterface
public interface IEstrategiaPagamento {

	void pagar(BigDecimal vlr);
	
}
