package com.bispo.aula.template_method;

public abstract class ProcessadorPagamento {

	// Template method
	public void processarPagamento() {

		/*
		 * Etapas fixas (n�o podem ser mudadas)
		 */
		preparar();
		validar();
		
		/*
		 * Deve ser implementada pela subclass
		 */
		debitar();
		
		/*
		 * A subclass pode estender esses metodos se quiser
		 */
		notificar();
		finalizar();
	}
	
	protected abstract void debitar();
	
	private void preparar() {
		System.out.println("Reservando produtos");
	}
	
	private void validar() {
		System.out.println("Validando cadastro");
	}
	
	protected void notificar() {
		System.out.println("Notificando usu�rios");
	}
	
	protected void finalizar() {
		System.out.println("Finalizando compra");
	}
	
}
	
