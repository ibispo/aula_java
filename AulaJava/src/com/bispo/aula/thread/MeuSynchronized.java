package com.bispo.aula.thread;

public class MeuSynchronized {

	static int i = -1;
	
	public static void main(String[] args) {

		MeuRodando meuRun = new MeuRodando();
		
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
	
	
	public static void imprime() {
		
		synchronized (MeuSynchronized.class) {
			i++;
			Thread nameT = Thread.currentThread();
			System.out.println(nameT + " : " + i);
			
		}
		
		
		
	}
	
	
	
	
	
	public static class MeuRodando implements Runnable {

		static Object lock1 = new Object();
		static Object lock2 = new Object();
		
		
		@Override
		// public synchronized void run() {
		
		/*

abc....
abc....
Thread[Thread-0,5,main] : 0
abc....
abc....
abc....
Thread[Thread-4,5,main] : 1
Thread[Thread-2,5,main] : 2
Thread[Thread-1,5,main] : 3
Thread[Thread-3,5,main] : 4

		 */
		
		public void run() {


			// imprime();
			
			
			
//			System.out.println("abc....");
			

			/*

			synchronized (this) {
				i++;
				Thread nameT = Thread.currentThread();
				System.out.println(nameT + " : " + i);
				
			}

			
			
			
			
			synchronized (lock1) {
				i++;
				Thread nameT = Thread.currentThread();
				System.out.println(nameT + " : " + i);
				
			}
			
			synchronized (lock2) {
				i++;
				Thread nameT = Thread.currentThread();
				System.out.println(nameT + " : " + i);
				
			}
			*/
			
			
		}
		
	}
	

}
