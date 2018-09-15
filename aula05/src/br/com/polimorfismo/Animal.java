package br.com.polimorfismo;

public abstract class Animal {
	private String ruido; // atributo da classe abstrata

	public Animal() {
		
	}
	
	public Animal(String ruido) { // construtor
		this.setRuido(ruido);
	}

	public abstract void fazerRuido(); // metodo abstrato

	public abstract void comer();

	//set e get 
	public String getRuido() {
		return ruido;
	}

	public void setRuido(String ruido) {
		this.ruido = ruido;
	}
	
	public abstract void caracteristica( String caracteristica);
	 
	
		
	
	
	
	
}
