
public class RunnableThread implements Runnable {
	
	public void run() {
		//conteudo da thread
		System.out.println("implementando Runnable");
		for (int i = 0; i <10; i ++) {
			System.out.println(i);
		}
	}

}
