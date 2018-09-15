
public class TestEnumeros02 {

	public static void main(String[] args) {

		
		//System.out.println(Enumeros02.AFRINIC.url());
		//System.out.println(Enumeros02.APNIC.url());
		//System.out.println(Enumeros02.ARIN.url());
		//System.out.println(Enumeros02.CNNIC.url());
		//System.out.println(Enumeros02.JPNIC.url());
		
		for(Enumeros02 status : Enumeros02.values()) {
			System.out.println(status.url());
		}

	}

}
