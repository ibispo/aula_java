package com.bispo.aula.prototype;

public class DocumentoNoCloneable {

	String nome;
	String tipo;
	String visibilidade;
	String localizacao;   // url, path, etc....

	public DocumentoNoCloneable() {
	}
	
	public DocumentoNoCloneable(DocumentoNoCloneable doc) {
		
		this.nome = doc.nome;
		this.visibilidade = doc.visibilidade;
		this.tipo = doc.tipo;
		this.localizacao = doc.localizacao;
		
	}
	
	// static factory method 
	public static DocumentoNoCloneable clone(DocumentoNoCloneable doc) {
		
		DocumentoNoCloneable docClone = new DocumentoNoCloneable();
		
		docClone.nome = doc.nome;
		docClone.visibilidade = doc.visibilidade;
		docClone.tipo = doc.tipo;
		docClone.localizacao = doc.localizacao;
		
		return docClone;
		
	}

	@Override
	public String toString() {
		return "DocumentoSemClone [nome=" + nome + ", tipo=" + tipo + ", visibilidade=" + visibilidade
				+ ", localizacao=" + localizacao + "]";
	}
	
	
}
