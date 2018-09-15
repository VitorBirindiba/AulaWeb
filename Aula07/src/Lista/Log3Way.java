package Lista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Log3Way {
	
	public void gerarLog(String textoLog) {
		
		try {
			
			String retorrno = lerArquivo();
			
			File arquivo = new File("c:\\log\\log.txt");
			
			FileWriter fw = new FileWriter(arquivo);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(retorrno);
			bw.newLine();
			bw.write(textoLog);
			
			bw.close();
			
			fw.close();
			
			System.out.println("Arquivo salvo");
			
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("arquivo não existe");
		}
	
	
		
	}

	public static String lerArquivo() {
		File arquivo = new File("c:\\log\\log.txt");
		String retorno = "";
		try {
			FileReader fileReader = new FileReader(arquivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while(bufferedReader.ready()) {
				retorno = bufferedReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}
}
