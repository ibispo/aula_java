package com.bispo.aula.strategy;

import java.math.BigDecimal;

import static java.lang.System.out;

public class AulaEstrategia {

	public static void main(String[] args) {
		
		BigDecimal vlr = new BigDecimal(100.5d);
		Compra compra = new Compra(vlr);
		
		compra.processarCompra(v -> out.println("Pagar no valor = " + v));
		
	}
	
}
