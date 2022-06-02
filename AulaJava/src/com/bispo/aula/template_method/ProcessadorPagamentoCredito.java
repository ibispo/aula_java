package com.bispo.aula.template_method;

public class ProcessadorPagamentoCredito extends ProcessadorPagamento {

	@Override
	protected void debitar() {
		System.out.println("Denitando...");
		
	}

	/*
	 * Problema se eu esquecer de acionar a super.notificar?????
	 */
	
	@Override
	protected void notificar() {
		
		// FIXME --- Problema é se eu esquecer de colocar essa linha.....
		// super.notificar();
		
		System.out.println("Notificar - adicionais");
		
	}
	
}
