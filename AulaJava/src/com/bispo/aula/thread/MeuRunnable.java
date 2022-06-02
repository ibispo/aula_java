package com.bispo.aula.thread;

public class MeuRunnable implements Runnable {

	@Override
	public void run() {
		String t1 = Thread.currentThread().getName();
		System.out.println(t1);
		
	}

}
