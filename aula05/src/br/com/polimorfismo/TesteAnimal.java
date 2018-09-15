package br.com.polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {

		Animal gato = new Gato();
		gato.comer();
		System.out.println(gato.getRuido());
		
	}

}
