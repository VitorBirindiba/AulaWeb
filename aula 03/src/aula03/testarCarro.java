package aula03;

public class testarCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carro gol = new carro();
		gol.modelo = "gol";
		gol.ano = 2018;
		gol.cor = "azul";
		gol.placa = "ono-1234";
		
		System.out.println(gol.modelo);
        System.out.println(gol.ano);
        System.out.println(gol.cor);
        System.out.println(gol.placa);
        
        gol.acelerar();
        System.out.println(gol.frear());
        System.out.println(gol.ligar());
	}

}
