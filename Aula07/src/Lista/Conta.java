package Lista;

public class Conta implements Comparable<Conta> {
	
	private int numero;
	private Clientes cliente;
	private String titular;
	
	public Conta(String titular, int numero) {
		this.numero = numero;
		this.titular = titular;	
		
	}
	
	public int compareTo(Conta outraConta) {
		if (this.getNumero() < outraConta.getNumero()) {
			return -1;
		}
		if (this.getNumero() > outraConta.getNumero()) {
			return 1;
		}
		return 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", cliente=" + cliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	

}
