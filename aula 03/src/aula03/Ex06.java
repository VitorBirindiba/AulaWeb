package aula03;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0 ;
		while(true) {
			if(contador == 2) {
				System.out.println("continue - (while-true)");
				contador ++;}
			if(contador == 10) {
				System.out.println("break - (while-true)");
				break;}
			System.out.println(contador);
			contador++;
		}
	}

}
