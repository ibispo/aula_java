package com.bispo.aula.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MeuFileVisitor extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws	IOException {
		// Método que será invocado a cada arquivo encontrado
		System.out.println("Arquivo visitado: " + file + ". Tamanho: " + attrs.size());
		return FileVisitResult.CONTINUE; // instrui o FileVisitor a continuar seguindo	a árvore de arquivos
	}
	
}
