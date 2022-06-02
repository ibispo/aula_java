package com.bispo.aula;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.regex.Pattern;

public class TesteStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		/*
		Stream.of(123, LocalDate.now(), 1.2d)
			// .map(e -> String.valueOf(e))
			// .peek(e -> System.out.println(e + " ------- " + e instanceof String))
			.forEach(TesteStream::show);
		
		Stream.iterate(2, nro -> nro * 2)
			.limit(31)
			.forEach(TesteStream::show);
		*/

		/*
		File f = new File("D://dados.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		br.lines()
			.forEach(TesteStream::show);
		*/
		
		
		/*
		Path p = Paths.get("D://");
		Files.list(p)
			.filter(fi -> !fi.toFile().isDirectory())
			.forEach(TesteStream::show);
			*/
		
		/*
		new Random().ints()
			.limit(10)
			.forEach(TesteStream::show);
		*/
		
		/*
		Pattern pt = Pattern.compile("\\W");
		pt.splitAsStream("Israel Marinho Bispo")
			.forEach(TesteStream::show);
		*/
		
		
		
	}
	
	private static void show(Object info) {
		System.out.println(info);
	}
	
	
}
