
public class Conta {
	private int numero;
	protected double saldo;
	private String titular;
		
	public Conta() {
	}
	
	public Conta(int numero, double saldo, String titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		
	}

	public void sacar(double valorSaque) {
		if (valorSaque < saldo) {
			double novoSaldo = saldo - valorSaque;
			saldo = novoSaldo;
		} else {
			System.out.println("saque não posível, saldo inferior");
		}
	}

	public void depositar(double valorDeposito) {
		double novoSaldo = saldo + valorDeposito;
		saldo = novoSaldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
