package br.com.polimorfismo;

public class ColecaoHeterogeneasDeObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro[] carros = new Carro[3];
		//coleçao de carros 
		
		carros [0] = new Carro("civic", 2012, "oiu-7654", "branco");
		carros [1] = new Carro("uno", 2010, "wer-2345", "preto");
		carros [2] = new Carro("rs 7" , 2014, "oiu-6543", "cinza");
		
		Barco [] barcos = new Barco [2];
		//coleção de Barcos
		barcos[0] = new Barco("xt65", 2015, "uhg-8374");
		barcos[1] = new Barco("ds43", 1985, "hgf-86721");
		
		//criação coleção
		Veiculo[] veiculo = new Veiculo [4];
		//atribuir referência a coleção
		veiculo[0] = new Carro("A4", 2010, "plw-0987", "azul");
		veiculo[1] = new Barco("dj98", 2014, "lkj-123");
		veiculo[2] = new Carro("i30", 2015, "rew-9876","cinza");
		veiculo[3] = new Avião("jato", 2016, "bel-1234");
		
		System.out.println(veiculo[0].getClass().getSimpleName());
		System.out.println(veiculo[1].getClass().getSimpleName());
		System.out.println(veiculo[2].getClass().getSimpleName());
		System.out.println(veiculo[3].getClass().getSimpleName());
		
		System.out.println(veiculo[0] instanceof Carro);
		System.out.println(veiculo[1] instanceof Barco);
	} 

}
