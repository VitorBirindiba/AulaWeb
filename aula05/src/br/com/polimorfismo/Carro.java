package br.com.polimorfismo;

public class Carro extends Veiculo{
	
	public Carro(String modelo, int ano, String placa, String cor) {
		super(modelo, ano, placa, cor);
		// TODO Auto-generated constructor stub
	}

	public void mover() { 
		System.out.println("correr");
	}

}
