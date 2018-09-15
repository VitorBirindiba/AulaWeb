package aula03;

import java.util.Scanner;

public class MaiorMenorIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a idade: ");
		int idade = scanner.nextInt();
		
		if (idade >=18) {
			System.out.println("Maior de 18 anos ");}
		
		else {
			System.out.println("menor de 18 anos ");}
		}

}
