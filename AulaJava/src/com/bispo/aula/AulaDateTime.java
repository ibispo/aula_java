package com.bispo.aula;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AulaDateTime {

	// Todas as classes são imutáveis e thread-safe
	
	public static void main(String[] args) throws InterruptedException {
		
		
//		System.out.println(LocalDate.now());
//		LocalDate nascimento = LocalDate.of(1974, 4, 18);
//		LocalDate hoje = LocalDate.now();
//		Period idade = Period.between(nascimento, hoje);
//		System.out.println(idade);		
		
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")));
		System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Lisbon")));
		
//		for ( String zon : ZoneId.getAvailableZoneIds() ) {
//			System.out.println(zon);
//		}
//		

//		ZoneId.getAvailableZoneIds().stream()
//			.sorted()
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
		
		
		
	}
	
	
}
