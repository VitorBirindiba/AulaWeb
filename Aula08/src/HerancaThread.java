
public class HerancaThread  extends Thread {

	public void run() {
		// conteudo thread
		System.out.println("extends Thread");
		for (int i =0; i <10; i++) {
			System.out.println(i);
		}

	}

}
