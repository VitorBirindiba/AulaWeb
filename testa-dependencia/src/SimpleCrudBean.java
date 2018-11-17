import java.io.Serializable;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

import threeway.projeto.service.Dao.LivroDao;
import threeway.projeto.service.modelo.Livro;

@ManagedBean
@SessionScoped
public class SimpleCrudBean  implements Serializable{
	private static  final long serialVersionUID = 1L;
	
	private List<Livro> list; 
	
	public List<Livro> getList() {
		return list;
	}


	public void setList(List<Livro> list) {
		this.list = list;
	}


	LivroDao dao = new LivroDao();
	
	
	@PostConstruct
	public void init() {
		list = dao.consultar("");
		
	}

}
