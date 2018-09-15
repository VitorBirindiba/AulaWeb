
public class Exercicio_02 {

	public static void main(String[] args) {
		Caneta canetaAzul =new Caneta();
		canetaAzul.cor = "azul";
		canetaAzul.modelo = "bic";
		canetaAzul.tampada = true;
		canetaAzul.carga = 95;
		System.out.println(canetaAzul.escreve("escrevendo com a caneta azul"));
		System.out.println(canetaAzul.cor);
		System.out.println(canetaAzul.modelo);
		System.out.println(canetaAzul.carga);
		System.out.println(canetaAzul.tampada);

		Caneta canetaVermelha = new Caneta();
		canetaVermelha.cor = "vermelha";
		canetaVermelha.modelo = "bic";
		canetaVermelha.tampada = false;
		canetaVermelha.carga = 50;
		System.out.println(canetaVermelha.escreve("escrevendo com a caneta vermelha"));
		System.out.println(canetaVermelha.cor);
		System.out.println(canetaVermelha.modelo);
		System.out.println(canetaVermelha.carga);
		System.out.println(canetaVermelha.tampada);
		
		Caneta canetaPreta = new Caneta();
		canetaPreta.carga = 100;
		canetaPreta.cor = "Preta";
		canetaPreta.modelo = "compact";
		canetaPreta.tampada = true; 
		System.out.println(canetaPreta.escreve("escrevendo com a caneta preta"));
		System.out.println(canetaPreta.cor);
		System.out.println(canetaPreta.modelo);
		System.out.println(canetaPreta.carga);
		System.out.println(canetaPreta.tampada);
		
	}

}
