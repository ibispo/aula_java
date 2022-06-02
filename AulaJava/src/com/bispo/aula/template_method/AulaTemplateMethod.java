package com.bispo.aula.template_method;

public class AulaTemplateMethod {

	public static void main(String[] args) {
		
		ProcessadorPagamento processadorPagamento = new ProcessadorPagamentoCredito();
		processadorPagamento.processarPagamento();

		
		ProcessadorPagamentoAdicional processadorPagamentoAdicional = new ProcessadorPagamentoCreditoAdicional();
		processadorPagamentoAdicional.processarPagamento();
		
		
	}
	
}
