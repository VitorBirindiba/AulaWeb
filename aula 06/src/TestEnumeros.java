
public class TestEnumeros {

	public static void main(String[] args) {
		System.out.println(Enumeros01.ATIVO);
	
		for (Enumeros01 status : Enumeros01.values()) {
			System.out.println(status);
		}
	}
	
}

