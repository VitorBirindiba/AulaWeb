
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		System.out.println("criando objeto Poupança");
	}
	
	public void sacar (double valorSaque) {
		System.out.println("sacando da classe conta");
		if(valorSaque < getSaldo() && valorSaque<100) {
			double novoSaldo = getSaldo() - valorSaque;
			saldo = novoSaldo;
		}
		else {
			System.out.println("Operaçao não possível ");
		}

	
	}
	
	

	

}
