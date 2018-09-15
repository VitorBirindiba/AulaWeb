
public class Calculadora02 {

	public static Double calculaMedia ( Double x , Double y ) throws MediaInsuficienteException {
		Double media = (x + y )/ 2 ;
		if (media < 6) {
			throw new MediaInsuficienteException();
		}
		return media;
	}
}
