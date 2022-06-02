package com.bispo.aula.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TesteColletion {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		show(list);
		
		list.removeIf(n -> n % 2 == 0);
		show(list);
			
		list.replaceAll(nro -> nro * 3);
		show(list);
		
		// Map
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "Israel");
		map.put(1, "Marinho");
		map.put(2, "Bispo");
		show(map);
		
		map.compute(3, (k, v) -> v + " now");
		show(map);
		
		map.merge(4, "!!!", (v1, v2 ) -> v1 + v2 );
		show(map);

		map.replaceAll((ch, vlr) -> vlr + "???");
		show(map);
		
	}

	private static void show(HashMap<Integer, String> map) {
		System.out.println();
		map.forEach((c, v) -> System.out.println("ch: " + c + " - vr: " + v) );
	}

	private static void show(List<Integer> list) {
		System.out.println();
		list.forEach(nro -> System.out.println(nro));
	}
	
	
	
}
