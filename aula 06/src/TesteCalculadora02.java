
public class TesteCalculadora02 {

	public static void main(String[] args) {

		Double nota1 = 5.0;
		Double nota2 = 4.0;
		try {
			System.out.println(Calculadora02.calculaMedia(nota1, nota2));
		}catch (MediaInsuficienteException e ) {
			
		}
	}

}
