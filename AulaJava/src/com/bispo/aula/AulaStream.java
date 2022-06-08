package com.bispo.aula;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

public class AulaStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		/*
		 * int a = 4; int b = 7; System.out.println(a & b); // prints 4 //meaning in an
		 * 32 bit system // 00000000 00000000 00000000 00000100 // 00000000 00000000
		 * 00000000 00000111 // =================================== // 00000000 00000000
		 * 00000000 00000100
		 * 
		 * Nro = Bin 1234 ---- 1 1 2 10 3 11 4 100 5 101 6 110 7 111 8 1000
		 * 
		 * 
		 */

		/*
		 * Stream.of(123, LocalDate.now(), 1.2d) // .map(e -> String.valueOf(e)) //
		 * .peek(e -> System.out.println(e + " ------- " + e instanceof String))
		 * .forEach(TesteStream::show);
		 * 
		 * Stream.iterate(2, nro -> nro * 2) .limit(31) .forEach(TesteStream::show);
		 */

		/*
		 * File f = new File("D://dados.txt"); FileReader fr = new FileReader(f);
		 * BufferedReader br = new BufferedReader(fr); br.lines()
		 * .forEach(TesteStream::show);
		 */

		/*
		 * Path p = Paths.get("D://"); Files.list(p) .filter(fi ->
		 * !fi.toFile().isDirectory()) .forEach(TesteStream::show);
		 */

		/*
		 * new Random().ints() .limit(10) .forEach(TesteStream::show);
		 */

		/*
		 * Pattern pt = Pattern.compile("\\W"); pt.splitAsStream("Israel Marinho Bispo")
		 * .forEach(TesteStream::show);
		 */

//		List<Integer> lista = Arrays.asList(
//			81, 103, 194, 8, 180, 175, 129, 37, 133, 18, 35, 
//			9, 134, 135, 137, 28, 180, 175, 129, 37, 133, 18 );

		
//		lista.stream()
//			// .skip(3)  // operacoes intermediarias
//			// .limit(4) // operacoes intermediarias
//			// .distinct()  // equals() e hashCode()
//			.forEach(e -> System.out.println(e));  // operacao final 
//		
		
		
		// expressão lambda completa
//		UnaryOperator<Double> elevarAoQuadrado1 = (Double x) -> { return Math.pow(x, 2); };
//		System.out.println(elevarAoQuadrado1.apply(40d));
//		
//		// expressão lambda simplificada
//		UnaryOperator<Double> elevarAoQuadrado2 = (x) -> Math.pow(x, 2);
		
//		Double x3 = 2.0;
//		UnaryOperator<Double> elevarAoX3 = (Double y) -> Math.pow(y, x3);
		// x3 = 3.0; // alteração
		
//		// Exemplo com Optional vazio
//		Optional<String> optionalVazio = Optional.empty();
//		System.out.println(optionalVazio.orElseThrow(() -> new RuntimeException("Erro.........")));
//		// as duas variáveis abaixo terão a String "valor padrao", pois o optional está 		vazio
//		String orElse = optionalVazio.orElse("valor padrao"); // obtém a String 		diretamente
//		String orElseGet = optionalVazio.orElseGet(() -> { return "valor padrao"; }); //		obtém a String através da expressão lambda
//		System.out.println(orElse);
//		System.out.println(orElseGet);
//		// Exemplo com Optional com valor
//		Optional<String> optionalComValor = Optional.of("valor");
//		// as duas variáveis abaixo irão utilizar o valor presente no optional, pois ele 		já está preenchido
//		String orElse2 = optionalComValor.orElse("valor padrao");
//		String orElseGet2 = optionalComValor.orElseGet(() -> { return "valor padrao"; });
//		System.out.println(orElse2);
//		System.out.println(orElseGet2);
		
//		Stream<Object> listaObj = Stream.of('B', 1, 2f, 3d, 4L, 5.0f, LocalDate.now(), "AAA", 'B');
//		
//		listaObj
//			// .sorted()
//			//.distinct()
//			// .map(el -> String.valueOf(el))
//			.peek(System.out::println)
//			.forEach(xxx -> System.out.println(xxx + " " + (xxx instanceof String)));
			
//		IntStream.rangeClosed(1, 4).forEach(System.out::print);		
		
		

//		List<String> list = Arrays.asList("A", "B", "C");
//		
//		System.out.println("Sequencial: ");
//		list.stream() // cria um Stream sequencial
//			.forEach(System.out::println);
//		
//		
//		System.out.println("Paralelo: ");
//		list.parallelStream() // cria um Stream paralelo
//			.forEach(System.out::println);	
		

		/// ********************************** STREAM PARALELO 
		
//		long inicio = System.currentTimeMillis();
//
//		IntStream.range(0, Integer.MAX_VALUE) // stream sequencial
//			.mapToDouble(n -> Math.pow(n, 2))
//			.average()
//			.ifPresent(n -> System.out.println("Tempo stream sequencial: " + (System.currentTimeMillis() - inicio)));
//		
//		long inicio2 = System.currentTimeMillis();
//		IntStream.range(0, Integer.MAX_VALUE)
//			.parallel() // stream paralelo
//			.mapToDouble(n -> Math.pow(n, 2))
//			.average()
//			.ifPresent(n -> System.out.println("Tempo stream paralelo: " + (System.currentTimeMillis() - inicio2)));
		
		
		
		Stream.of(7, 2, 3, 8, 2, 1, 4, 5)
			.reduce((e1, e2) -> e1 - e2)
			.ifPresent(System.out::println);
		
		// 7-2 = 5
		// 5-3 = 2
		// 2-8 = -6
		// -6-2 = -8
		// -8-1 = -9
		// -9-4 = -13
		// -13-5 = -18
		
		
		Stream.of(7, 2, 3, 8, 2, 1, 4, 5)
			.parallel()
			.reduce((e1, e2) -> e1 - e2)
			.ifPresent(System.out::println);		

		// PODE TER SIDO OBSERVADA ESSA ORDEM
		// 1 THREAD--------
		//   7-2=5
		// 2 THREAD----------
		// 5-3=2 
		// 2-8 = -6
		// 3 thread----------
		// 2-1 = 1
		// 4 THREAD---------
		// 4-5 = -1
		
		
		
		
		
		
		
		
		
	}

	private static void show(Object info) {
		System.out.println(info);
	}

	private static void getNomeMes(final String mai) {

		String mes = "JUN";

		final String abr = "ABR";

		int i1 = 1_000 & 2_2;

		// mai = "";

		System.out.println(mai);

		switch (mes) {
		case abr:
			System.out.println("Abr");
			break;
		// case mai: // embora seja "final", ela pode mudar em tempo de execução
		// System.out.println("Ola Mai");
		// break;
		default:
			break;
		}

	}

}
