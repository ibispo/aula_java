package com.bispo.aula.locale;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class AulaLocale {

	public static void main(String[] args) throws IOException {

//		System.out.println(" - Constantes - ");
//		System.out.println(Locale.CANADA);
//		System.out.println(Locale.UK);
//		
//		System.out.println(" - Construtor - ");
//		System.out.println(new Locale("pt", "BR"));
//		System.out.println(new Locale("pt", "PT"));
//		System.out.println(new Locale("ca", "ES", "VALENCIA"));
//		
//		System.out.println(" - Language Tags - ");
//		System.out.println(Locale.forLanguageTag("en-CA"));
//		System.out.println(Locale.forLanguageTag("pt-BR"));
//		System.out.println(Locale.forLanguageTag("pt-PT"));
//		System.out.println(Locale.forLanguageTag("ca-ES"));
//		System.out.println(Locale.forLanguageTag("gsw-u-sd-chzh"));
//
//		System.out.println(" - Builder - ");
//		Locale locale1 = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
//		System.out.println(locale1);
//		
//		Locale locale2 = new Locale.Builder().setLanguage("az").setRegion("AZ").setScript("Latn").build();
//		System.out.println(locale2);
//		
//		Locale locale3 = new Locale.Builder().setLanguage("bs").setRegion("BA").setVariant("POSIX").setScript("Latn")
//				.setExtension('c', "cc").build();
//		System.out.println(locale3);

		// imprimir todos
//		for (Locale loc : Locale.getAvailableLocales()) {
//			System.out.println(loc);
//		}		

		// ##########################################################
		
		Locale.setDefault(new Locale("en", "US"));  // ************** SETOU O PADRAO **************
		
		System.out.println("\n -- Locale padrão (en_US) -- ");
		ResourceBundle bundleDefault = ResourceBundle.getBundle("resources/Text");
		Set<String> keySetDefault = bundleDefault.keySet();
		for (String string : keySetDefault) {
			System.out.println(string + " - [" + bundleDefault.getString(string) + "]");
		}
		
		// AQUI SO ENTRA O QUE QUERO MUDAR
		System.out.println("\n -- Locale es_ES -- ");
		ResourceBundle bundleEsEs = ResourceBundle.getBundle("resources/Text", new Locale("es", "ES"));
		Set<String> keySetEsEs = bundleEsEs.keySet();
		for (String string : keySetEsEs) {
			System.out.println(string + " - [" + bundleEsEs.getString(string) + "]");
		}
		
		
		// AQUI SO ENTRA O QUE QUERO MUDAR
		System.out.println("\n -- Locale pt_BR -- ");
		ResourceBundle bundlePtBr = ResourceBundle.getBundle("resources/Text", new Locale("pt", "BR"));
		Set<String> keySetPtBr = bundlePtBr.keySet();
		for (String string : keySetPtBr) {
			System.out.println(string + " - [" + bundlePtBr.getString(string) + "]");
		}
		
		// CLASSE
		ResourceBundle bundle = ResourceBundle.getBundle("com.bispo.aula.locale.Text", new Locale("fr", "CA"));
		System.out.println("\n -- Locale fr_CA -- ");
		System.out.println("glass - [" + bundle.getString("glass") + "]");		

	}

}
