
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
		System.out.println("criando objeto Poupan�a");
	}
	
	public void sacar (double valorSaque) {
		System.out.println("sacando da classe conta");
		if(valorSaque < getSaldo() && valorSaque<100) {
			double novoSaldo = getSaldo() - valorSaque;
			saldo = novoSaldo;
		}
		else {
			System.out.println("Opera�ao n�o poss�vel ");
		}

	
	}
	
	

	

}
