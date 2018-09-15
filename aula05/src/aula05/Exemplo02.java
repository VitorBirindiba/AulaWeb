package aula05;

public class Exemplo02 {

			//Exemplo de variavel estática
		static String staticVariable = "variavel de classe ou estatica";
		
		//Exemplo de variável de instância
		String instanceVariable = "variavel de intância";
		
		public static void main(String[] args) {
			
			String localVariable = "variavel local";
			System.out.println("variavel estatica = " + staticVariable);
			
			Exemplo02 variavel = new Exemplo02();
			
			System.out.println("variavel de instância" + variavel.instanceVariable);
			System.out.println("variavel local = " + localVariable);
	}

}
