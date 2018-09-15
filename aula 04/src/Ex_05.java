import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {

		Scanner captura = new Scanner(System.in);
		Operacoes calculadora = new Operacoes();

		System.out.println("Digite o primeiro número: ");
		double n1 = captura.nextDouble();
		System.out.println("Digite o segundo número: ");
		double n2 = captura.nextDouble();

		System.out.println("Que operação deseja realizar ? ");
		System.out.println("1 - Soma");
		System.out.println("2 - multiplicação ");

		System.out.println("Digite o número da operação :");

		int operacoes = captura.nextInt();
		if (operacoes == 1) {
			System.out.println(calculadora.soma(n1, n2));
		}
		if (operacoes == 2) {
			System.out.println(calculadora.multiplicacao(n1, n2));
		}
	}

}
