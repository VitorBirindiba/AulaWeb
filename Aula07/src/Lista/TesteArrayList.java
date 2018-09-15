package Lista;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {

		List<String> listaString = new ArrayList<String>();
		
		//checa o tamanho
		System.out.println(listaString + ", size = " + listaString.size());
		
		//add itens ao ArrayList
		listaString.add("Vitor");
		listaString.add("Luciana");
		listaString.add("Eduardo");
		listaString.add("Alice");
		
				
		System.out.println(listaString + ", size = " + listaString.size());
		
		//remover item, usa equals e hashCode
		listaString.remove("Vitor");
		System.out.println(listaString + ", size = " + listaString.size());
		
		//checar lista se contem o elemento especifico 
		Boolean contem = listaString.contains("Alice");
		System.out.println("A lista contem Alice = " + contem );
		
		contem = listaString.contains("Thiago");
		System.out.println("A lista contem Thiago = " + contem);
		
		listaString.add("Flora");
		listaString.add("Gatitinha");
		listaString.add("Tom");
		
		System.out.println(listaString + ", size = " + listaString.size());
		
		listaString.remove("Tom");
		System.out.println(listaString + ", size = " + listaString.size());
	}

}
