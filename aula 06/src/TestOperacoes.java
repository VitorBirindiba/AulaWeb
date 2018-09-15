
public class TestOperacoes {

	public static void main(String[] args) {

		double result = Operacoes.SOMA.calculate(3, 5);
		System.out.println(result);
		
		double result02 = Operacoes.SUBTRACAO.calculate(3, 5);
		System.out.println(result02);
		
		double result03 = Operacoes.MULTIPLICACAO.calculate(3, 5);
		System.out.println(result03);
		
		double result04 = Operacoes.DIVISAO.calculate(3, 5);
		System.out.println(result04);
		
	}

}
