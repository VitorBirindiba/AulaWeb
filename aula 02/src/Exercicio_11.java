import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a Primeira nota: ");
		int nota1 = scanner.nextInt();
		
		System.out.println("Digite a Segunda nota: ");
		int nota2 = scanner.nextInt();
		
		System.out.println("Digite a Terceira nota: ");
		int nota3 = scanner.nextInt();
		
		System.out.println("Digite a Quarta nota: ");
		int nota4 = scanner.nextInt();
		
		double media = ((nota1+nota2+nota3+nota4)/4);
		
		if (media>= 6 ) {
			System.out.println("Aprovado");}
		else if (media <6 && media>=5) {
			System.out.println("Recuperação");}
		else {
			System.out.println("Reprovado");
		}
		System.out.println(media);		

	}

}
