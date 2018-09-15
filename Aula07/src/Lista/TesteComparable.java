package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteComparable {

	public static void main(String[] args) throws Exception {
		
		Conta conta1 = new Conta("Phillip Lahm", 5452);
		Conta conta2 = new Conta("Lucas Podolski", 1234);
		Conta conta3 = new Conta("Arne Friedrich", 3145);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(conta1);
		lista.add(conta2);
		lista.add(conta3);
		
		for (Conta conta : lista) {
			System.out.println("======+" + conta.getNumero());
		}

		Collections.sort( lista);
		
		for (Conta conta : lista) {
			System.out.println("=======" + conta.getNumero());
		}
		
		
	}

}
