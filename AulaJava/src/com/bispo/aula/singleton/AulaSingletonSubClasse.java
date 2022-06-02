package com.bispo.aula.singleton;

public class AulaSingletonSubClasse {

	
	
	
	
}


// ------------------
//
class ConfigApp {
	
	// Lazy
	private static ConfigApp instance;
	
	public String name;
	public String version;
	public String color;
	
	protected ConfigApp() {
		this.name = "Singleton";
		this.version = "3.0";
		this.color = "Green";
	}
	
	// parametro jvm
	// mapa - registro dos singletons
	// classpath
	
	
	public ConfigApp getInstance() {
		if (instance == null) {
			String config = System.getProperty("class.configuracao");
			if ( config == "teste") {
				instance = new ConfigAppTeste();
			}
			instance = new ConfigApp();
		}
		return instance;
	}
	
	
	
}


class ConfigAppTeste extends ConfigApp {

	protected ConfigAppTeste() {
		this.name = "Singleton - Teste";
		this.version = "4.0";
		this.color = "Red";
	}
	
	
}


