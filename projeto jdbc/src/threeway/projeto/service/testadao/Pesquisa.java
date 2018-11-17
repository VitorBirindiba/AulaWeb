package threeway.projeto.service.testadao;

import threeway.projeto.service.Dao.LivroDao;
import threeway.projeto.service.modelo.Livro;

public class Pesquisa {
	
	static LivroDao dao = new LivroDao();

	public static void main(String[] args) {
		
		//testaConsulta("harry");
		//testaConsultaPorCodigo(30);
		//detelaPorCodigo(8);
		//livro = testaConsultaPorCodigo(1);
		//update(testaConsultaPorCodigo(30));
		
		Livro livro = new Livro();
		livro.setAutor("Teste novo");
		livro.setDescricao("Nova descrição");
		livro.setImagem("caminho da imagem");
		livro.setPreco(45.78);
		livro.setTitulo("titulo do livro ");
		dao.inserir(livro);
	}
	
	public static void testaConsulta(String titulo) {
		
		for(Livro livro : dao.consultar(titulo)) {
			System.out.println("Cod: " + livro.getCodigo() + " \tDesc: \t" + livro.getTitulo() +
					" \tAutor: \t" + livro.getAutor() + " \tPreço: \t" + livro.getPreco() + 
					" \tTitulo: \t" + livro.getTitulo() + " \tImagem: \t" + livro.getImagem());
		}
	}
	
	public static Livro testaConsultaPorCodigo(int codigo) {
		Livro livro = new Livro();
		livro = dao.consultaPorCodigo(codigo);
		System.out.println("Titulo: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Descrição: " + livro.getDescricao());
		System.out.println("Imagem: " + livro.getImagem());
		System.out.println("Valor: " + livro.getPreco());
		
		return livro;
		
	}
	
	public static void detelaPorCodigo(int codigo) {
		dao.deleta(codigo);
	}
	
	public static void update(Livro livro) {
		livro.setTitulo("Teste de novo titulo");
		dao.update(livro);
	}
}
