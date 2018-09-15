package br.com.polimorfismo;

public class Peixe extends Animal{
	
	public  Peixe() {
		// TODO Auto-generated constructor stub
		super ("bolhas ");
	}
	

	@Override
	public void fazerRuido() {
		System.out.println("bolhas" + this.getRuido());
	}

	@Override
	public void comer() {
		System.out.println("algas");
	}

	@Override
	public void caracteristica(String caracteristica) {
		System.out.println(caracteristica);
		
	}
	

}
