package com.bispo.aula;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.stream.Collectors;

public class AulaNumberFormat {

	public static void main(String[] args) {

		NumberFormat currencyFormatPtBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		NumberFormat currencyFormatEnUS = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		NumberFormat currencyFormatFrFR = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
		
		// Valor monetário para String
		double d = 1000.05;
		System.out.println("pt_BR: " + currencyFormatPtBR.format(d));
		System.out.println("en_US: " + currencyFormatEnUS.format(d));
		System.out.println("fr_FR: " + currencyFormatFrFR.format(d));

		// String para valor Monetário
		String s = "R$ 1000,05";
		try {
			System.out.println("pt_BR: " + currencyFormatPtBR.parse(s));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("en_US: " + currencyFormatEnUS.parse(s));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("fr_FR: " + currencyFormatFrFR.parse(s));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		double dd = 12345.67;
		DecimalFormat decimalFormat = new DecimalFormat("Número ###,###.### formatado");
		System.out.println(decimalFormat.format(dd));		
		
		
//		for ( Locale loc : DecimalFormatSymbols.getAvailableLocales() ) {
//			System.out.println(loc);
//		}
		
		
			
		
		
		
		
		
		
		
		
		
		
		

	}

}
