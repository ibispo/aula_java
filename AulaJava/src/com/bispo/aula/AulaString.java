package com.bispo.aula;

import java.util.Arrays;
import java.util.List;

public class AulaString {

	public static void main(String[] args) throws InterruptedException {

		/*
		Instant inicio = Instant.now();
		Thread.sleep(10000);
		
		new Random().ints()
			.limit(10_0000_000)
			.boxed()
			.map(i -> i.toString())
			.collect(Collectors.joining());
		
		Thread.sleep(5000);
		Instant fim = Instant.now();
		System.out.println(Duration.between(inicio, fim));
		*/
		
		List<String> listaNro = Arrays.asList("1", "2", "3", "4", "5");
		
		
		listaNro
			.sort((a,b) -> b.compareTo(a));
		
		mudaLista(listaNro);
		listaNro.stream()
			.forEach(System.out::println);
		
	}

	private static void mudaLista(List<String> listaNro) {
		listaNro.set(4,"6");
	}

	
}
;