
public class Ex_03 {

	public static void main(String[] args) {

		int[] idades = {10, 11, 12};
		for (int i = 0; i < idades.length; i++ ) {
			System.out.println(idades[i]);
		}
		
		teste(idades);
		
		for (int i=0; i<idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

	private static void teste(int[] arr) {

		for (int i = 0; i <arr.length; i++) {
			arr[i] = i + 50;
		}
	}

}
