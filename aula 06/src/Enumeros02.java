
public enum Enumeros02 {

	ARIN("whois.arin.net"),
	RIPE("whoir.ripe.net"),
	APNIC("whois.apnic.net"),
	AFRINIC("whois.afrinic.net"),
	LACNIC("whois.lacnic.net"),
	JPNIC("whois.jpnic.net"),
	KRNIC("whois.nic.or.kr"),
	CNNIC("whois.cnnic.cn"),
	UNKOWN("");
	
	private String url;
	
	private Enumeros02(String url) {
		this.url = url;
		
	}
	
	public String url() {
		return url;
		
	}
	
}
