package br.com.polimorfismo;

public  class Veiculo {
	
	private String cor;
	private String placa;
	private int ano;
	private String modelo; 
	
	
	public  Veiculo(String modelo, int ano, String placa, String cor) {
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.cor = cor; 
	}
			
	public  void  mover() {
		System.out.println("Veiculo se movendo");
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa; 
	}
	public String getPlaca() {
		return placa;
	}
	public void setAno( int ano) {
		this.ano= ano;
	}
	public int getAno() {
		return ano;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
} 
