package com.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.jasper.compiler.Node.ForwardAction;

import com.web.dao.LivroDao;
import com.web.model.Livro;

@WebServlet("/LivroController")
public class LivroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String INSERIR_OU_EDITAR	 = "/livros.jsp";
	private static final String LISTAR_LIVROS ="/listarLivros.jsp";
	
	private LivroDao dao = new LivroDao();
       
    public LivroController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paginaEncaminhar = "";
		String action = request.getParameter("action");
		String buscarLivro = request.getParameter("buscarLivro");
		
		if (action != null && action.equalsIgnoreCase("deletar")) {
			int LivroId = Integer.parseInt(request.getParameter("livroId"));
			dao.removeById(LivroId);
			paginaEncaminhar = LISTAR_LIVROS;
			request.setAttribute("livros", dao.listarTodos());
		}else if (action != null && action.equalsIgnoreCase("editar")) {
			int codigoLivro = Integer.parseInt(request.getParameter("livroId"));
			Livro livro = dao.consultar(codigoLivro);
			paginaEncaminhar = INSERIR_OU_EDITAR;
			request.setAttribute("livro", livro);
		} else if(action != null && action.equalsIgnoreCase("listarLivros")) {
			paginaEncaminhar = LISTAR_LIVROS;
			request.setAttribute("livros", dao.listarTodos());
		}else if(buscarLivro != null) {
			List<Livro> livros = dao.consultar(buscarLivro);
			request.setAttribute("livros", livros);
			paginaEncaminhar = LISTAR_LIVROS;
		}else {
			paginaEncaminhar = INSERIR_OU_EDITAR;
		}
			RequestDispatcher view = request.getRequestDispatcher(paginaEncaminhar);
			view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livro livro = new Livro();
		livro.setTitulo(request.getParameter("titulo"));
		livro.setAutor(request.getParameter("autor"));
		livro.setDescricao(request.getParameter("descricao"));
		livro.setPreco(Double.parseDouble(request.getParameter("preco")));
		String codigoLivro = request.getParameter("livroCodigo");
		
		if (codigoLivro == null || codigoLivro.isEmpty()) {
			dao.save(livro);
	}else {
		livro.setCodigo(Integer.parseInt(codigoLivro));
		dao.updateTitulo(livro);
	}
	request.setAttribute("livros", dao.listarTodos());
	RequestDispatcher view = request.getRequestDispatcher(LISTAR_LIVROS);
	view.forward(request, response);
		
	}
}
