package com.bispo.aula;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AulaLambda {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		// Stream -> Fluxo de dados
		List<Integer> listao = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		listao.stream()
			.filter(new Predicate<Integer>() {
				@Override
				public boolean test(Integer t) {
					// TODO Auto-generated method stub
					return t%3==0;
				}
			})
			.forEach((item) -> System.out.println(item));

		// Fim
		System.exit(-1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		Pessoa pes = new Pessoa() {
			
			@Override
			public void levantar() {
				System.out.println("Levantando...");
				
			}
			
			@Override
			public void dormir() {
				System.out.println("Dormindo");
				
			}
		};
		
	//	new Corredor().dormir();
	//	pes.dormir();
		
		new Thread(new Roda() {

			@Override
			public void run() {
				System.out.println("Hello world!");
				
			}

			@Override
			public void claro() {
				// TODO Auto-generated method stub
				
			}
			
		}); // .start();
		
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
		
		// Optional<Integer> numMinMax = 
		// Map<Boolean,List<Float>> mapa = lista.stream()
		String mapa = lista.stream()
			// .filter(w -> w % 2 == 0)
			//	.map(i -> (float) i / 3) 
				.map(i -> String.valueOf(i)) 
			// .collect(Collectors.toList());
			//.collect(Collectors.groupingBy(h -> h > 2));
			.collect(Collectors.joining(";", "[", "]"));
			// .min(Comparator.naturalOrder());
		// System.out.println(mapa);

		
//		Optional<Integer> nro = Stream.of(1,2,3)
//			.findFirst();
//		System.out.println(nro.get());
		
//		Stream.of(1,2,3)
//			.findFirst()
//			.ifPresent(System.out::println); // System.out::println --- method reference 
		
		
//		String dado = "Bispo";
//		// String dado = "1";
//		int nro = convertNumber(dado)
//			.orElseThrow(() -> new NullPointerException("Null Empty"));
//		System.out.println(nro);
		

		List<Integer> listaInt = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6);

		// -> supplier / accumulator / combination
		Set<Integer> listaSet = listaInt.stream()
			.collect( 
				() -> new HashSet<>(), 
				(l, e) -> l.add(e), 
				(l1, l2) -> l1.addAll(l2) 
			);
				
		// "var" em Lambda Somente no JAVA 11
		// listaSet.forEach((var e) -> System.out.println(e) );
		
		
			
//		System.out.println(listaInt);
//		System.out.println(listaSet);
				
		
//		Set<Integer> listaCollector = listaInt.stream()
//			// .filter((n) -> n % 2 == 0)
//			//.collect(Collectors.toSet());
//			.collect(Collectors.toCollection(() -> new TreeSet<Integer>()));
//		
//		System.out.println(listaCollector);
		
//
//		Double media = listaInt.stream()
//			.collect(
//				Collectors.averagingInt(n -> n.intValue()));
//		System.out.println(media);
//		
		
/*
		lista.stream()

			// ************** opera????es intermediaria
			//.skip(2) 
			//.limit(3)
			//.distinct()
			.filter(w -> w % 2 == 0)
			//.map(i -> (float) i / 3) // a lista original n??o ?? alterada
		
			// ************** opera????o final
			.forEach(e -> System.out.println("AAAAAAAAA  =  "  + e));
			//.count();
		
		
		lista.stream()
			.filter(e -> e % 2 == 0)
			.map(v -> "v = " + v)
			.forEach(System.out::println);

 */	
		
		
		
		
		/*
		
		
		System.out.println("LocalDate ---------------------------");
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate dtNasc = LocalDate.of(1974, Month.APRIL, 18);
		System.out.println(dtNasc);
		
		//////////

		System.out.println("LocalTime ---------------------------");
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		LocalTime hrNasc = LocalTime.of(15, 35, 14, 56465465);
		System.out.println(hrNasc);
		
		///////////////
		
		System.out.println("LocalDateTime ---------------------------");
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalDateTime ldtHrNasc = LocalDateTime.of(dtNasc, hrNasc);
		System.out.println(ldtHrNasc);
		
		//////////
		
		System.out.println("LocalInstant ---------------------------");
		
		Instant inst = Instant.now();
		System.out.println(inst);

		Instant instMili = Instant.ofEpochMilli(55555555);
		System.out.println(instMili);
		
		//////////
		
		System.out.println("ZonedDateTime ---------------------------");
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		ZoneId zId = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdtNasc = ZonedDateTime.of(ldtHrNasc, zId);
		System.out.println(zdtNasc);
		
		
		*/
		
		////////////// Java 11
		
		/*
		
		Uso de var
		
		var i = "Apache";
		System.out.println("i = " + i); 
		*/

		
		
		/*
		
		HttpClient (v.2)
		
		
		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request =
				HttpRequest.newBuilder()
					.uri(URI.create("https://www.google.com.br/"))
					.GET()
					.build();
		
		HttpResponse<String> response = 
			httpClient.send(request, BodyHandlers.ofString());
		
		System.out.println(response.body());
		*/
		
		
		/*
		 
			toArray()
			
			

Method Reference
Integer[]::new

		List.Of(1,2,3,4)

		 */
		
		
		
		/*
		  
		  String
		  
		
		var valor = "Israel";
		
		valor.isBlank();       // -> String cont??m espa??os
		valor.lines();         // Stream de linhas
		valor.repeat(3);       // repeat
		valor.strip();         // .trim()
		valor.stripLeading()   // .trim() a frente
		valor.stripTrailing()  // .trim() atr??s
		
		 */
		

		/*

		 Remo????o dos m??dulos 
		 Java EE e CORBA

			JAX-WS
			JAXB
			CORBA

		 */

		
		/*
		     
		      Unicode 10.0
		      
		      16.018 novos caracteres
		      
		      
		 */
		
		
		/*
		  
		   Epsilon
		  Garbage Collector
		  
		  No-op GC
		   
		System.gc();
		   
		 */

		
		/*
		 
			Java Flight Recorder (JFR)
			Parte da JDK


		 */
		
		/*
		
			Run .java files directly

			java file.java .

		 */
		
		
		
		
	}

	
	
	
	public static OptionalInt convertNumber(String s) {
		
		try {
			int i = Integer.parseInt(s);
			return OptionalInt.of(i);
		} catch (Exception e) {
			return OptionalInt.empty();
		}
		
		
	}
	
	
	
	
	
	interface Roda extends Runnable {
		void claro();
	}
	
	
	// @FunctionalInterface
	interface Pessoa {
		void levantar();
		void dormir();
	}
	
	
	static class Corredor implements Pessoa {

		@Override
		public void levantar() {
			System.out.println("Waking up....");
		}

		@Override
		public void dormir() {
			System.out.println("Sleeping....");
		}
		
	}
	
	
	
	
}
