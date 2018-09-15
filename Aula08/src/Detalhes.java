import java.util.ArrayList;
import java.util.HashMap;

public class Detalhes {

	public static void main(String[] args) {

		ArrayList<String> lista = new  ArrayList<>();
		lista.add("Stack");
		lista.add("Overflow");
		
		//	Index | Elemento
		//	   0  | "Stack"
		//     1  | "Overflow"
		
		String retornoList = lista.get(0); // str1 receberá "stack"
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1,"Stack");
		hashMap.put(2,"Vitor");
		hashMap.put(3,"Lili");
		hashMap.put(4,"Lolo");
		hashMap.put(5, "Overflow");
		
		
		//   key | valeu
		//    1  | "Stack"
		//    5  | "Overflow"
		
		String retornoMap = hashMap.get(5); // str receberá ? overflow
			System.out.println(hashMap.get(5));
			System.out.println(hashMap.get(1));
			System.out.println(hashMap.get(2));
			System.out.println(hashMap.get(3));
			System.out.println(hashMap.get(4));
		
	}

}
