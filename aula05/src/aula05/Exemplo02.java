package aula05;

public class Exemplo02 {

			//Exemplo de variavel est�tica
		static String staticVariable = "variavel de classe ou estatica";
		
		//Exemplo de vari�vel de inst�ncia
		String instanceVariable = "variavel de int�ncia";
		
		public static void main(String[] args) {
			
			String localVariable = "variavel local";
			System.out.println("variavel estatica = " + staticVariable);
			
			Exemplo02 variavel = new Exemplo02();
			
			System.out.println("variavel de inst�ncia" + variavel.instanceVariable);
			System.out.println("variavel local = " + localVariable);
	}

}
