package br.com.polimorfismo;

public class Avi�o extends Veiculo{
	
	public Avi�o(String modelo, int ano, String placa) {
		super(modelo, ano, placa, null);
		// TODO Auto-generated constructor stub
	}

	public void mover () {
		System.out.println("Voar");
	}
}
