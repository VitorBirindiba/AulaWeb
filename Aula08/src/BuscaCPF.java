import java.util.HashMap;

public class BuscaCPF {

	public static void main(String[] args) {
		buscaCPF(22222222222l);

	}

	public static void buscaCPF(Long cpf) {

		HashMap<Long, String> hashMap = new HashMap<>();
		hashMap.put(11111111111l, "DuDU");
		hashMap.put(22222222222l, "Vitor");
		hashMap.put(33333333333l, "Lili");
		hashMap.put(44444444444l, "Lolo");
		hashMap.put(55555555555l, "Flora");

		if (hashMap.containsKey(cpf)) {
			System.out.println("Valor da chave " + cpf + " = " + hashMap.get(cpf));
		} else {
			System.err.println("Chave não existe");
		}

	}

}
