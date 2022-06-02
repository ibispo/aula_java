package com.bispo.aula.strategy;

import java.math.BigDecimal;

public class Compra {

	BigDecimal valor;
	
	public Compra(BigDecimal vlr) {
		this.valor = vlr;
	}
	
	void processarCompra(IEstrategiaPagamento estrat) {
		estrat.pagar(this.valor);
	}
	
}
