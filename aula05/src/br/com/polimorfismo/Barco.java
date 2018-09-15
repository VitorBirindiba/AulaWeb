package br.com.polimorfismo;

public class Barco extends Veiculo{
	
	public Barco(String modelo, int ano, String placa) {
		super(modelo, ano, placa, null);
		// TODO Auto-generated constructor stub
	}

	public void mover() {
		System.out.println("Navegar");
		}

}
