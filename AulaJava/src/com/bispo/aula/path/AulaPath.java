package com.bispo.aula.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Random;

public class AulaPath {

	public static void main(String[] args) {

//		// diretório padrão do usuário
//		String userHome = System.getProperty("user.home");
//		System.out.println("User home: " + userHome);
//		
//		// path absoluto
//		Path path1 = Paths.get("/home/rinaldo");
//		System.out.println("Path 1: " + path1);
//		
//		// path absoluto dividido em strings
//		Path path2 = Paths.get("/", "home", "rinaldo");
//		System.out.println("Path 2: " + path2);
//		
//		// path absoluto a partir do userHome
//		Path path3 = Paths.get(userHome);
//		System.out.println("Path 3: " + path3);
//		
//		// path absoluto para um arquivo
//		Path path4 = Paths.get("/home/rinaldo/arquivos/arquivo.txt");
//		System.out.println("Path 4: " + path4);
//		
//		// path absoluto para um arquivo a partir do userHome
//		Path path5 = Paths.get(userHome, "arquivos", "arquivo.txt");
//		System.out.println("Path 5: " + path5);
//		
//		// path absoluto em um sistema windows
//		Path path6 = Paths.get("C:/users/rinaldo");
//		System.out.println("Path 6: " + path6);
//		
//		// path absoluto windows divido em strings
//		Path path7 = Paths.get("C:", "users", "rinaldo");
//		System.out.println("Path 7: " + path7);
//		
//		// path relativo
//		Path path8 = Paths.get("rinaldo");
//		System.out.println("Path 8: " + path8);
//		
//		// path a partir de uma URI
//		Path path9 = Paths.get(URI.create("file:///home/rinaldo/arquivos/arquivo.txt"));
//		System.out.println("Path 9: " + path9);
//
//		// path sem utilizar a classe Paths - produz o mesmo resultado
//		Path path10 = FileSystems.getDefault().getPath("/home/rinaldo");
//		System.out.println("Path 10: " + path10);		

		new Thread( new Runnable() {

			@Override
			public void run() {


				String userHome = System.getProperty("user.home");
				System.out.println("User home: " + userHome);
				// Utilizando um nome aleatório de arquivo,
				// apenas para o exemplo executar inúmeras vezes sem problemas
				String nomeAleatorio = "arquivo" + new Random().nextInt() + ".txt";
				Path path = Paths.get(userHome, nomeAleatorio);
				System.out.println("Path: " + path);
				try {
					System.out.println("Path existe? " + Files.exists(path));
					Files.createFile(path); // cria o arquivo
					System.out.println("Path existe? " + Files.exists(path));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				try (BufferedWriter bw = Files.newBufferedWriter(path)) {
					// escreve no arquivo
					for ( int i=1; i<=30000000; i++ ) {
						bw.write("Numero " + i);
						bw.newLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			}
			
		}); // .run();
		
		// System.out.println("Fim");
		
		
		
//		String userHome = System.getProperty("user.home");
//		System.out.println("User home: " + userHome);
//		// Utilizando um nome aleatório de arquivo,
//		// apenas para o exemplo executar inúmeras vezes sem problemas
//		String nomeAleatorio = "arquivo" + new Random().nextInt() + ".txt";
//		Path path = Paths.get(userHome, nomeAleatorio);
//		System.out.println("Path: " + path);
//		try {
//			System.out.println("Path existe? " + Files.exists(path));
//			Files.createFile(path); // cria o arquivo
//			System.out.println("Path existe? " + Files.exists(path));
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		
//		try (BufferedWriter bw = Files.newBufferedWriter(path)) {
//			// escreve no arquivo
//			for ( int i=1; i<=30000000; i++ ) {
//				bw.write("Numero " + i);
//				bw.newLine();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		try (BufferedReader br = Files.newBufferedReader(path)) {
//			// lê as linhas do arquivo
//			String line = br.readLine();
//			do {
//				System.out.println(line);
//			} while (br.readLine() != null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		try {
//			List<String> conteudo = Files.readAllLines(path);
//			// System.out.println(conteudo);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		String userHome = System.getProperty("user.home");
		Path path = Paths.get(userHome, ".m2"); // "arquivo_negao.txt");
		System.out.println("Path: " + path);		
		
		
//		try {
//			BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
//			System.out.println("Tamanho (bytes): " + attributes.size());
//			System.out.println("Tamanho (KB): " + (attributes.size()/1024d)  );
//			System.out.println("É diretório? " + attributes.isDirectory());
//			System.out.println("É link simbólico? " + attributes.isSymbolicLink());
//			System.out.println("É um arquivo comum? " + attributes.isRegularFile());
//			System.out.println("Não é nenhuma das opções acima? " + attributes.isOther());
//			System.out.println("Data de Criação: " + attributes.creationTime());
//			System.out.println("Último acesso: " + attributes.lastAccessTime());
//			System.out.println("Última modificação: " + attributes.lastModifiedTime());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}		

		
//		try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
//			// iteração com operação forEach e expressão lambda
//			directoryStream.forEach(p -> System.out.println(p));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}		
		
//		try {
//			// Utilização da classe MeuFileVisitor para acessar
//			// todos os arquivos no diretório e seus subdiretórios
//			Files.walkFileTree(path, new MeuFileVisitor());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}		
		

		try {
			System.out.println("\nTodos os arquivos e diretórios: ");
			Files.walk(path, 2 /* até o 2º nivel */, FileVisitOption.FOLLOW_LINKS) // cria o stream
				.forEach(System.out::println); // imprime no console
			
			
			// ao chamar o find:
			// primeiro argumento: o path inicial
			// segundo argumento: o limite de profundidade
			// terceiro argumento: expressão lambda para filtrar			
			
			Files.find(path, 0, (p, a) -> a.isRegularFile() )
				.forEach(System.out::println); 
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		
	}

}
