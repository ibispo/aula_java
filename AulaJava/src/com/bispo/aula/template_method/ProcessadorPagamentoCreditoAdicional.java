package com.bispo.aula.template_method;

public class ProcessadorPagamentoCreditoAdicional extends ProcessadorPagamentoAdicional {

	@Override
	protected void debitar() {
		System.out.println("Denitando...");
	}

	@Override
	protected void notificarAdicional() {
		System.out.println("Notific Adicional..........");
		
	}
	
	
}
