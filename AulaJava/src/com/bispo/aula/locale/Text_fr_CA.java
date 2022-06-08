package com.bispo.aula.locale;

import java.math.BigDecimal;
import java.util.ListResourceBundle;

public class Text_fr_CA extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{"pen", "stylo"},
			{"glass", "verre"},
			{"keyboard", "clavier"},
			
			{"ten", new BigDecimal("10")}
			
		};
	}

}
