import java.util.ArrayList;
import java.util.List;

public class TestaOrdenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Frutas> frutas = new ArrayList<Frutas>();
		
		Frutas fruta01 = new Frutas();
		fruta01.nome = "mamão";
		frutas.add(fruta01);
		
		Frutas fruta02 = new Frutas();
		fruta02.nome = "abacaxi";
		frutas.add(fruta02);
		
		Frutas fruta03 = new Frutas();
		fruta03.nome = "banana";
		frutas.add(fruta03); 
		
		AnonnymousInnerClass class1 = new AnonnymousInnerClass();
		System.out.println(frutas);
		class1.ordenar(frutas);
		System.out.println(frutas);

	}

}
