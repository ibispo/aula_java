package com.bispo.aula.prototype;

public class AulaPrototype {

	/*
	 * 3
	 *    - Próprio prototype (Cloneable)
	 *    - ConcretePrototype
	 *    - Cliente
	 */
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		/* ********************************************************************
		 * 1º exemplo
		
		Documento doc = new Documento();
		
		doc.nome = "ListaDeMembros.pdf";
		doc.tipo = "PDF";
		doc.visibilidade = "restrito";
		doc.localizacao = "arquivos.sistema:1234/plo39d8a.pdf";
		
		System.out.println(doc);
		
		System.out.println("---");
		
		Documento doc2 = doc.clone();
		System.out.println(doc2);
		
		System.out.println("---");

		doc.nome = "Lista2.pdf";
		System.out.println(doc);
		System.out.println(doc2);
		
		 */
		
		
		/* ********************************************************************
		 * 2º exemplo
		
		DocumentoRegistry registry = DocumentoRegistry.getInstance();
		Documento pdfRestrito = registry.getDocumento("PDF RESTRITO");
		System.out.println(pdfRestrito);
		
		
		pdfRestrito.nome="NovoNome";
		System.out.println(pdfRestrito);
		
		
		
		pdfRestrito = registry.getDocumento("PDF RESTRITO");
		System.out.println(pdfRestrito);		
		
		 */
		

		
		/* ********************************************************************
		 * 3º exemplo 
		 * ----------
		 * O sistema adiciona os modelos na lista 
		 * 
		 */ 
		
		
		criarModelo("PDF", "RESTRITO");
	//	criarModelo("DOC", "RESTRITO");
//		criarModelo("PDF", "PUBLICO");
	//	criarModelo("DOC", "PUBLICO");
		
		DocumentoRegistryNoStatic reg = DocumentoRegistryNoStatic.getInstance();
		
		Documento novoDoc = reg.getDocumento("PDF RESTRITO");
		novoDoc.nome = "novo doc";
		System.out.println(novoDoc);

		Documento novoDoc3 = reg.getDocumento("PDF RESTRITO");
		System.out.println(novoDoc3);
		
	}

	private static void criarModelo(String tp, String vis) {
		Documento doc = new Documento();
		doc.tipo = tp;
		doc.visibilidade = vis;
		doc.nome = tp + " " + vis;
		
		String chv = doc.nome;
		DocumentoRegistryNoStatic.getInstance().addDocumento(chv, doc);
	}
	
	
	
}
