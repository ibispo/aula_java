package com.bispo.aula.prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentoRegistryNoCloneable {

	
	private static final DocumentoRegistryNoCloneable INSTANCE = new DocumentoRegistryNoCloneable();
	private static final Map<String, DocumentoNoCloneable> REGISTRY = new HashMap<>();
	
	private DocumentoRegistryNoCloneable() {
		
	}
	 
	
	public static DocumentoRegistryNoCloneable getInstance() {
		return INSTANCE;
	}

	/*
	 * Quase como um Factory Method ou construtor
	 */
	
	public DocumentoNoCloneable getDocumento(String chv) {
		DocumentoNoCloneable prototype = REGISTRY.get(chv);
		
		int aa = 1;
		boolean usarEstatico = (aa == 1);
		if ( usarEstatico ) {
			return DocumentoNoCloneable.clone(prototype); /// static factory method
		} else {
			return new DocumentoNoCloneable(prototype); 
		}
		
	}

	/*
	 * A partir do input do usuário, o sistema vai adicionando os modelo de documento
	 */
	
	public DocumentoNoCloneable addDocumento(String chv, DocumentoNoCloneable doc) {
		return REGISTRY.put(chv, doc);
	}
	
	
}
