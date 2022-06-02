package com.bispo.aula.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TesteCollectionParallel {

	public static void main(String[] args) {
		
		List<Integer> listNro = Arrays.asList(1, 2, 3, 4);

		/*
		listNro.parallelStream()
			.forEach(System.out::println);
		System.out.println();
		*/
		
		/*
		System.out.println();
		IntStream.range(0, 5).parallel()
			.forEach(System.out::println);
		*/
		
		// precisando ganhar performance
		 
		/*
		listNro.parallelStream()
			.forEach(System.out::println);
		
		System.out.println();
		listNro.parallelStream()
			.forEachOrdered(System.out::println);
		 */

		/*
		System.out.println();
		listNro.parallelStream()
			.findAny()
			.ifPresent(System.out::println);
		System.out.println();
		
		
		listNro.stream()
			.findAny()
			.ifPresent(System.out::println);
		System.out.println();
		*/

		/*
		listNro.parallelStream()
			.unordered()    
			.skip(1)
			.limit(2)
			.forEach(System.out::println);
		*/
		
		// operação associativa (no matter parenthesis order)
		// 1 + 2 + 3 + 4 = 10
		// 1 + (2 + 3 + 4) = 10

		// operação NÃO associativa 
		// 1 - 2 - 3 - 4 = -8
		// (1 - 2) - (3 - 4) = -2
		
		// reduce com paralelismo - SOMENTE operações associativas
		
		/*
		listNro.parallelStream()
			.reduce((n1, n2) -> n1 + n2)
			.ifPresent(System.out::println);
		System.out.println();
		*/
		
		/*
		listNro.parallelStream()
			.peek(System.out::println)
			.reduce( (n1, n2) -> { 
				System.out.println("N1 " + n1 + " ----- " + "N2 " + n2);
				return n1 - n2; 
			})
			.ifPresent(System.out::println);
		*/
		
		Map<Integer, Boolean> coList = 
			listNro.parallelStream()
				.collect(
					Collectors.toMap(n -> n, n -> n%2==0)
				);
			
		
		coList
			.forEach((k,v) -> System.out.println("K=" + k + " - V=" + v) );
		
		
		
		
		
		
		
		  
		
		
	}
	
}
