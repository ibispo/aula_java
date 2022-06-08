package com.bispo.aula.concurrent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AulaConcurrent {

	public static void main(String[] args) {

//		BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
//
//		try {
//			queue.offer("ABC", 1, TimeUnit.SECONDS);
//		} catch (InterruptedException e) {
//			System.out.println("Não conseguiu inserir em menos de 1 segundo.");
//		}
//
//		try {
//			queue.poll(1, TimeUnit.SECONDS);
//		} catch (InterruptedException e) {
//			System.out.println("Não conseguiu remover em menos de 1 segundo.");
//		}
//
//		// ######################################################################
//		
//		BlockingDeque<String> queue2 = new LinkedBlockingDeque<String>();
//		try {
//			queue2.offerFirst("ABC", 1, TimeUnit.SECONDS);
//			queue2.offerLast("DEF", 1, TimeUnit.SECONDS);
//		} catch (InterruptedException e) {
//			System.out.println("Não conseguiu inserir em menos de 1 segundo.");
//		}
//		try {
//			queue2.pollFirst(1, TimeUnit.SECONDS);
//			queue2.pollLast(1, TimeUnit.SECONDS);
//		} catch (InterruptedException e) {
//			System.out.println("Não conseguiu remover em menos de 1 segundo.");
//		}
//
//		// ######################################################################
//		
//		List<String> list = new CopyOnWriteArrayList<String>();
//		list.add("A");
//		list.add("B");
//		list.add("C");
//
//		for (String string : list) {
//			System.out.println(string);
//			if (string.equals("A")) {
//				list.add("D");
//			}
//		}
//		System.out.println("AAAAAAAAAA Lista final: " + list);		
//		
//
//		
//		
//		List<String> listAntesB = new ArrayList<String>();
//		
//		List<String> listB = Collections.synchronizedList(listAntesB);
//		
//		listB.add("A");
//		listB.add("B");
//		listB.add("C");
//
//		for (String string : listB) {
//			System.out.println(string);
//			if (string.equals("A")) {
//				listB.add("D");
//			}
//		}
//		System.out.println("BBBBBBBBBBBBBB Lista final: " + listB);		
//		
//		
		
		
		
		
		
		
		// Criação de um CyclicBarrier para 3 threads
//		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
//		
//		// Criação das threads
//		Thread thread1 = new Thread(new Acao(cyclicBarrier));
//		thread1.setName("PrimeiraThread");
//		
//		Thread thread2 = new Thread(new Acao(cyclicBarrier));
//		thread2.setName("SegundaThread");
//		
//		Thread thread3 = new Thread(new Acao(cyclicBarrier));
//		thread3.setName("TerceiraThread");
//		
//		
//		// Início de execução das threads
//		thread1.start();
//		thread2.start();
//		thread3.start();		
//		
		
	
		
//		Lock lock = new ReentrantLock();
//		
//		// Criação das threads
//		Thread thread1 = new Thread(new Acao(lock));
//		Thread thread2 = new Thread(new Acao(lock));
//		Thread thread3 = new Thread(new Acao(lock));
//		// Execução das threads
//		thread1.start();
//		thread2.start();
//		thread3.start();
		
		
		
//		List<Callable<String>> tarefas = new ArrayList<Callable<String>>();
//		tarefas.add(() -> "");
		
		

		
//		ExecutorService executor = null;
//		try {
//			executor = Executors.newFixedThreadPool(250); // executor com duas threads
//			
//			for ( int i=1; i<=1000; i++ ) {
//				executor.execute(() -> System.out.println("Tarefa " + "X" + " - Thread do Executor: " +
//						Thread.currentThread().getName()));
//				
//			}
//		
//		} finally {
//			if (executor != null) {
//				executor.shutdown();
//			}
//		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
