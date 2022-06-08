package com.bispo.aula.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;

public class Acao implements Runnable {

	// CyclicBarrier cyclicBarrier;
	
	private Lock lock;

	public Acao( Lock lok /*CyclicBarrier cyclicBarrier*/) {
		// this.cyclicBarrier = cyclicBarrier;
		this.lock = lok;
	}

	@Override
	public void run() {
		
		
			if (lock.tryLock()) {
				try {
					System.out.println(Thread.currentThread().getName() + ": Conseguiu o Lock");
				} finally {
					lock.unlock();
				}
			}		
		
		
		
		
		
		
		
		/*
		System.out.println(Thread.currentThread().getName() + ": Primeira Parte");

		try {
			cyclicBarrier.await(); // sincronização das threads
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": Segunda Parte");

		try {
			cyclicBarrier.await(); // sincronização das threads
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": Terceira Parte");
		*/
	}

}
