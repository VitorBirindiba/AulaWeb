import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Nio2 {

	public static void main(String[] args) {
		
		escrita();
		leitura();
		
		}

	
	
	public static void escrita() {
		
		String fileStr = "aquivo.txt";

		Path path = Paths.get(fileStr);


		List<String> linhas = new ArrayList<>();
		linhas.add("hello, world!");
		linhas.add("hello, world!");
		linhas.add("hello, world!");
		linhas.add("hello, world!");
		linhas.add("hello, world!");
		linhas.add("hello, world!");

		try {
			Files.write(path, linhas, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}

	public static void leitura() {
		try {
			// lê todas as linhas e atribui para uma lista

			Path path = null;
			List<String> inLines = Files.readAllLines(path, Charset.forName("UTF-8"));

			// pega linha por linha
			for (String linha : inLines) {
				 System.out.println(linha);
				// percorre os carcteres da linha até o fim - linha.Length()-
				for (int i = 0; i < linha.charAt(i); i++) {

					// ... e lê caractere por caractere
					char charOut = linha.charAt(i);
					System.out.println();
					System.out.printf("[%d] '%c'", (i + 1), charOut);
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		
		
	}
}
}
