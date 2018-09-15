import java.util.Scanner;

public class Ex_06 {

	public  static void main(String[] args) {
 
		Scanner captura = new Scanner(System.in);
		
		Operacoes calculadora = new Operacoes();
		
				
		
		System.out.println("Digite o primeiro número: " );
		double n1 = captura.nextDouble();
		System.out.println("Digite o segundo número: ");
		double n2 = captura.nextDouble();
		
		System.out.println(calculadora.soma(n1, n2));
		System.out.println(calculadora.multiplicacao(n1, n2));
	}

}
