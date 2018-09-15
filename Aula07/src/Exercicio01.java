import java.util.Scanner;

import Lista.Log3Way;

public class Exercicio01 extends Exception {

	public static void main(String[] args) throws SexoInvalidoException {
		
		Log3Way log = new Log3Way();
		log.gerarLog("Iniciando execução");
		
		Scanner scanner = new Scanner(System.in);
		
		

		System.out.println("Informe o sexo");
		String sexo = scanner.next();

		if (sexo.equals("F") || sexo.equals("f")) {
			System.out.println("Feminino");
		} else if (sexo.equals("M") || sexo.equals("m")) {
			System.out.println("Masculino");
		} else {
			log.gerarLog("Erro ao tentar definir o sexo");
			throw new SexoInvalidoException(" Sexo inválido");
		} log.gerarLog("Finalizando execução");
	}

}
