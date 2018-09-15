package br.com.interface01;

public class Calculadora01 implements Interface01 {

	@Override
	public Double soma(Number X, Number Y) {
		Double resultado = X.doubleValue() +Y.doubleValue();
		return resultado ;
	}

	@Override
	public Double subtracao(Number X, Number Y) {
		Double resultado = X.doubleValue() - Y.doubleValue();
		return resultado;
	}

	@Override
	public Double multiplicacao(Number X, Number Y) {
		Double resultado = X.doubleValue() * Y.doubleValue();
		return resultado;
	}
	
	

}
