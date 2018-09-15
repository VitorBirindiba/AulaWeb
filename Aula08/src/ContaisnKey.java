import java.util.HashMap;
import java.util.Map;

public class ContaisnKey {

	public static void main(String[] args) {

		Map<String , String > example = new HashMap<String, String>();
		/*
		 * Vamos adicionar alguns valores a nossa lista 
		 */
		example.put("k1", new String("V1"));
		example.put("k2", new String("V2"));
		example.put("k3", new String("V3"));
		example.put("k4", new String("V4"));
		example.put("k5", new String("V5"));
		example.put("k6", new String("V6"));
		example.put("k5", new String("V7"));
		example.put("k7", new String("V8"));
		example.put("k8", new String("V9"));
		example.put("k9", new String("V10"));
		example.put("k10", new String("V11"));
		example.put("k11", new String("V12"));
		example.put("k12", new String("V13"));
		
		String keyToSearch = "k2";
		
		if (example.containsKey(keyToSearch)) {
			System.out.println("Valor da chave " + keyToSearch + " = " + example.get(keyToSearch));
		} else {
			System.err.println("Chave não existe");
		}
		
		/*
		 * O método "keySet()" retorna um Set com todas as chaves do 
		 * nosso HashMap, e tendo o Set com todas as chaves, 
		 * podemos facilmente pegar 
		 * os valores que desejamos  
		 */
		for (String key : example.keySet()) {
			// capturamos o valor a partir da chave 
			String value = example.get(key);
			System.out.println(key + " = " + value );
		}
	}
	

}
