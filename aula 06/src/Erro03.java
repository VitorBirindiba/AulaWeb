import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class Erro03 {
	public static void main(String... args) {
		PrintStream ps = System.out;
		int[] array = { 1, 2, 3, 4 };
		try (InputStreamReader leitor02 = new InputStreamReader(System.in)){
			Character ch = (char) leitor02.read();
			int i = Integer.parseInt(ch.toString());
			ps.println(array[i]);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | IOException e) {
			ps.printf("Um erro aconteceu : %s\n", e.getMessage());
			e.printStackTrace();
		} 
	}
}
