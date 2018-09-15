
public class Carro {


	private String modelo;
	private String cor;
	private int ano;
	private String placa;
	
	static int contador;
	
	public Carro() {
		contador++;
		System.out.println("Criando objeto carro");		
	}
	
	public String acelerar() {return "acelereando";}
	public String frear () { return "freando";}
	public String ligar () {return "ligando";}
	
	public static String getContadorIntancia() {
		return ("objeto criado. Existem " + contador + " objetos criados da mesma classe");
	}

}
