package br.com.polimorfismo;

public class TestaReferênciaPolimorficas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo veiculo = new Carro("clio", 2014, "ono9089", "preta") ;
		veiculo.mover();
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getModelo());
		System.out.println(veiculo.getPlaca());
		
		veiculo = new Avião("tam", 2018, "sdf-9876");
		veiculo.mover();
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getModelo());
		System.out.println(veiculo.getPlaca());
		
		veiculo = new Barco("lança", 1985, "ska-9876");
		veiculo.mover();
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getModelo());
		System.out.println(veiculo.getPlaca());

	}

}
