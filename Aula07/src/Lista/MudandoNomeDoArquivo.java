package Lista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MudandoNomeDoArquivo {

	public MudandoNomeDoArquivo(File arquivo) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			File arquivo = new File("c:\\aula\\teste.txt");
			
			FileWriter fw = new FileWriter(arquivo);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Texto a ser escrito no txt");
			bw.newLine();
			bw.write("quebra da linha");
			
			bw.close();
			
			fw.close();
			
			System.out.println("Arquivo salvo");
			
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("arquivo não existe");
		}
	}

}
