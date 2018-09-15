package br.com.interface01;

public class TesteCalc {

	public static void main(String[] args) {

		Calculadora01 calc = new Calculadora01();
		System.out.println(calc.multiplicacao(3, 5));
		System.out.println(calc.soma(10, 4));
		System.out.println(calc.subtracao(10, 5));
	}

}
