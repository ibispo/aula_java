package com.bispo.aula.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentoRegistryNoStatic {

	
	private static final DocumentoRegistryNoStatic INSTANCE = new DocumentoRegistryNoStatic();
	private static final Map<String, Documento> REGISTRY = new HashMap<>();
	
	private DocumentoRegistryNoStatic() {
		
	}
	 
	
	public static DocumentoRegistryNoStatic getInstance() {
		return INSTANCE;
	}

	/*
	 * Quase como um Factory Method ou construtor
	 */
	
	public Documento getDocumento(String chv) {
		try {
			return REGISTRY.get(chv).clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	/*
	 * A partir do input do usuário, o sistema vai adicionando os modelo de documento
	 */
	
	public Documento addDocumento(String chv, Documento doc) {
		return REGISTRY.put(chv, doc);
	}
	
	
}
