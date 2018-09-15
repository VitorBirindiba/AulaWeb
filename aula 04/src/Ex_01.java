
public class Ex_01 {

	public static void main(String[] args) {

		Conta conta = new Conta(1000, 123456, "vitor");
		
		
		conta.depositar(1000);
		System.out.println(conta.getSaldo());
		
		conta.sacar(3500);
		System.out.println(conta.getSaldo());
		System.out.println(conta.getNumero());
		System.out.println(conta.getTitular());
			
		
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setNumero(12345);
		poupanca.setSaldo(5000);
		poupanca.setTitular("vitor");
		
		poupanca.depositar(1000);
		System.out.println(poupanca.getSaldo());
		
		poupanca.sacar(90);
		System.out.println(poupanca.getSaldo());
		System.out.println(poupanca.getNumero());
		System.out.println(poupanca.getTitular());
	}

}
