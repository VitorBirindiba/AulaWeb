
public class Exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mesDoAno = 12;
		
		if (mesDoAno == 12 || mesDoAno == 1 || mesDoAno ==2) {
			System.out.println("Verão");} 
		else if (mesDoAno == 3 || mesDoAno == 4 || mesDoAno ==5) {
			System.out.println("Outono");}
		else if (mesDoAno == 6 || mesDoAno == 7 || mesDoAno ==8) {
			System.out.println("Inverno");}
		else if (mesDoAno == 9 || mesDoAno == 10 || mesDoAno ==11) {
			System.out.println("Primavera");}
		else {
			System.out.println("Mês não é válido " + mesDoAno);
		}
		
	}

}
