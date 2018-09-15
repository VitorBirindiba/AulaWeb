
public class exercicio_05 {

	public static void main(String[] args) {
		int valor01 = 10;
		int valor02 = 100;
		
		boolean resultadoDoMaiorQue = valor01 > valor02;
		System.out.println(resultadoDoMaiorQue);
		
		boolean resultadoDoMaiorOuIgual = valor01 >= valor02 ; 
		System.out.println(resultadoDoMaiorOuIgual);
		
		boolean resultadoDoMenorque = valor01 < valor02 ;
		System.out.println(resultadoDoMenorque);
		
		boolean resultadoDoMenorOuIgual = valor01 <= valor02;
		System.out.println(resultadoDoMenorOuIgual);
		
		boolean resultadoDoIgual = valor01 == valor02;
		System.out.println(resultadoDoIgual);
		
		boolean resultadoDoDiferente = valor01 != valor02;
		System.out.println(resultadoDoDiferente);
		
		System.out.println(resultadoDoMenorque&&resultadoDoIgual);
		System.out.println(resultadoDoMenorOuIgual||resultadoDoMaiorQue);
		System.out.println(resultadoDoMaiorOuIgual^resultadoDoMenorque);

	}

}
