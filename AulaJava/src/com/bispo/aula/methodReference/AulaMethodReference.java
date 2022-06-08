package com.bispo.aula.methodReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class AulaMethodReference {

	public static void main(String[] args) {
		
		// representa��o com express�o lambda
		Function<Integer, String> converteIntEmStr1 = x -> String.valueOf(x);

		// 	representa��o com refer�ncia ao m�todo
		Function<Integer, String> converteIntEmStr2 = String::valueOf;


		// representa��o com express�o lambda
		Function<Integer, String> converteIntEmStr3 = x -> Utils.retornaNome(x);

		// 	representa��o com refer�ncia ao m�todo
		Function<Integer, String> converteIntEmStr4 = Utils::retornaNome;
		
		Ut utili = new Ut();
		Function<String, Boolean> convVlr = utili::converte; 
		
		
		System.out.println(converteIntEmStr1.apply(1));
		System.out.println(converteIntEmStr2.apply(2));		
		System.out.println(converteIntEmStr3.apply(3));
		System.out.println(converteIntEmStr4.apply(4));
		System.out.println(convVlr.apply("valor"));
		
		
		Consumer<String> consumer = j -> System.out.println(j);
		consumer.accept("ol�.");
		
		
		Supplier<Integer> sup = () -> 12 * 3;
		System.out.println(sup.get()); 
		
		
	}
	
	
	static class Ut {
		
		public Boolean converte(String vlr) {
			return vlr.equals("valor");
		}
		
	}
	
	
}

