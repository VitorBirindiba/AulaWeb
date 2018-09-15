package br.com.polimorfismo;

public class Gato extends Animal {

	public Gato() {
		super("Miauuuu, miauuuu");
	}

	@Override
	public void fazerRuido() {
		// TODO Auto-generated method stub
		System.out.println("miar" + this.getRuido());
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("come rato");
	}

	@Override
	public void caracteristica(String caracteristica) {
		// TODO Auto-generated method stub
		
	}
	
	

}
