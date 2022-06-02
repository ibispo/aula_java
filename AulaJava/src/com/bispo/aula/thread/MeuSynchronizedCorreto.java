package com.bispo.aula.thread;

public class MeuSynchronizedCorreto {

	private static int i = 0;
	
	public static void main(String[] args) {
		
		MeuRunnable meuRun = new MeuRunnable();
		
		Thread t0 = new Thread(meuRun);
		Thread t1 = new Thread(meuRun);
		Thread t2 = new Thread(meuRun);
		Thread t3 = new Thread(meuRun);
		Thread t4 = new Thread(meuRun);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	public static class MeuRunnable implements Runnable {
		@Override
		public void run() {
			int j;
			synchronized (this) {
				i++;
				j = i * 2;
			}
			
			double jElevadoA100 = Math.pow(j, 100);
			double raizQuadrada = Math.sqrt(jElevadoA100);
			System.out.println("Thread: " 
					+ Thread.currentThread().getName() 
					+ " i = " + i 
					+ " = " + raizQuadrada);
		}
	}

	
}
