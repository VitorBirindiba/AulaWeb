import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {

		Scanner captura = new Scanner(System.in);
		Operacoes calculadora = new Operacoes();

		System.out.println("Digite o primeiro n�mero: ");
		double n1 = captura.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double n2 = captura.nextDouble();

		System.out.println("Que opera��o deseja realizar ? ");
		System.out.println("1 - Soma");
		System.out.println("2 - multiplica��o ");

		System.out.println("Digite o n�mero da opera��o :");

		int operacoes = captura.nextInt();
		if (operacoes == 1) {
			System.out.println(calculadora.soma(n1, n2));
		}
		if (operacoes == 2) {
			System.out.println(calculadora.multiplicacao(n1, n2));
		}
	}

}
