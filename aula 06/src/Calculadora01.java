
public class Calculadora01 {
	public static Double calcularMedia (Double x , Double y ) throws Exception {
		Double media = (x + y )/ 2 ;
		if (media < 6) {
			throw new  Exception ("Criando exceção com throw"); 
		} 
		return media;
	}
	

}
