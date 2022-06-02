package com.bispo.aula.prototype;

import java.util.HashMap;
import java.util.Map;

public final class DocumentoRegistry {
	
	private static final DocumentoRegistry INSTANCE = new DocumentoRegistry();
	private static final Map<String, Documento> REGISTRY = new HashMap<>();
	
	static {
		
		Documento d1 = new Documento();
		d1.tipo = "PDF";
		d1.visibilidade = "RESTRITO";
		REGISTRY.put("PDF RESTRITO", d1);
		
		Documento d2 = new Documento();
		d2.tipo = "PDF";
		d2.visibilidade = "PUBLICO";
		REGISTRY.put("PDF PUBLICO", d2);

		Documento d3 = new Documento();
		d3.tipo = "DOC";
		d3.visibilidade = "RESTRITO";
		REGISTRY.put("DOC RESTRITO", d3);
		
		Documento d4 = new Documento();
		d4.tipo = "DOC";
		d4.visibilidade = "PUBLICO";
		REGISTRY.put("DOC PUBLICO", d4);
		
		
	}
	
	public static DocumentoRegistry getInstance() {
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
	
	
}
