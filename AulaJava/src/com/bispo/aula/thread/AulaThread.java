package com.bispo.aula.thread;

public class AulaThread {


	public static void main(String[] args) {
		
		// Thread atual
		Thread t = Thread.currentThread();
		System.out.println(t.getName());

		MeuRunnable meuRun = new MeuRunnable();

		
		// Nova Thread
		Thread t1 = new Thread(meuRun);
		// t1.run(); //// executando na mesma thread
		
		// Runnable com lambda
		Thread t2 = new Thread
				(() -> System.out.println("T2 Inscreva"));
		
		// Nova Thread
		Thread t3 = new Thread(meuRun);
		
		
		
		t1.start();  /// executando em uma nova thread
		t2.start();
		t3.start();   
	}
		
}
