package com.bispo.aula.template_method;

public abstract class ProcessadorPagamentoAdicional {

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
		 * (n�o podem ser mudadas)
		 */
		notificar();

		/*
		 * A subclass pode estender esses metodos se quiser
		 */
		notificarAdicional();
		
		/*
		 * (n�o podem ser mudadas)
		 */
		finalizar();

		/*
		 * A subclass pode estender esses metodos se quiser
		 */
		finalizarAdicional();
		
	}
	
	protected abstract void debitar();
	
	private void preparar() {
		System.out.println("Reservando produtos");
	}
	
	private void validar() {
		System.out.println("Validando cadastro");
	}
	
	private void notificar() {
		System.out.println("Notificando usu�rios");
	}
	
	private void finalizar() {
		System.out.println("Finalizando compra");
	}
	
	/*
	 * Metodos protected (podem ser usados pela subclass
	 * 
	 * Hooks
	 * 
	 */
	
	protected void notificarAdicional() {
		// TODO E para ser vazio
	}
	
	protected void finalizarAdicional() {
		// TODO E para ser vazio
	}

	
}
	
