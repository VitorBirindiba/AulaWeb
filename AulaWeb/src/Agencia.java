import java.util.List;


public class Agencia {
	
	private String nome;
	private List <Conta> myList;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getMyList() {
		return myList;
	}
	public void setMyList(List<Conta> myList) {
		this.myList = myList;
	}

}
