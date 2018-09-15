import java.io.*;

public class Erro02 {

	public static void main(String[] args) {

		try {
			int a []= new int [2];
			System.out.println("acessar elemento 3 : " + a[3]);
		} catch  (ArrayIndexOutOfBoundsException  e ) {
			e.printStackTrace();
			System.out.println("criando exceção : " + e);
		}
		System.out.println("fora do bloco");
	}

}
