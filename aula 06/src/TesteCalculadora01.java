
public class TesteCalculadora01 {

	public static void main(String[] args) {

		Double nota1 = 5.0;
		Double nota2 = 4.0;
		
		try {
			System.out.println(Calculadora01.calcularMedia(nota1, nota2));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Tratamento do erro : ");
			System.out.println(e.getMessage());
		}
	}

}
