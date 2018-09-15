package br.com.polimorfismo;

public class Avião extends Veiculo{
	
	public Avião(String modelo, int ano, String placa) {
		super(modelo, ano, placa, null);
		// TODO Auto-generated constructor stub
	}

	public void mover () {
		System.out.println("Voar");
	}
}
