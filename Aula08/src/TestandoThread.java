
public class TestandoThread {

	public static void main(String[] args) {

		HerancaThread threadSimples = new HerancaThread();
		
		Thread threadRunnable = new Thread(new RunnableThread());
		
		threadSimples.start();
		
		threadRunnable.start();
	}

}
