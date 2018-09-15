package Lista;

import java.lang.reflect.Method;

public class Printer {

	/**
	 * adicionando na versao java 5, tem como objetivo possibilitar a tipagem de m�todos
	 * e classes de forma a assegurar a integridade da implementa��o 	 * 
	 */
	public <T> void printArray(T[] array) {
		for (T valor : array) {
			System.out.println(valor );
		}

	}

}
