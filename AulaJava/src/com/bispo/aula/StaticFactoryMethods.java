package com.bispo.aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StaticFactoryMethods {

	public static void main(String[] args) {
		
		// Nome com significado
		Optional<Integer> empty = Optional.empty();
		Optional<Integer> cem = Optional.of(100);
		Optional<Integer> vazio = Optional.ofNullable(null);
		 
		// Flexibilidade de retorno
		ArrayList<Object> list = new ArrayList<>();
		List<Object> newList = Collections.unmodifiableList(list);
		
		// newList.add(1); --- exceptions
		
		// Controle das instancias
		Integer nroCem = Integer.valueOf(100);
		Integer nroDuz = Integer.valueOf(200);
		Integer nroTre = Integer.valueOf(300);
		
		
		//// Java 9
		
		// Antes
		List<Integer> listaNro = Arrays.asList(nroCem, nroDuz, nroTre);
		List<Integer> singletonListaNro = Collections.singletonList(nroCem);
		
		// Listas imutáveis
		List<Integer> listZero = List.of();
		List<Integer> listOfNro = List.of(nroCem, nroDuz, nroTre);
		
		
		
		// String _ = "1";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
