package com.web.servelt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.modelo.Livro;

@WebServlet("/LivrosJSTL")
public class LivrosJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LivrosJSTL() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				Livro livro1 = new Livro();
				livro1.setAutor("seu ze");
				livro1.setTitulo("inicio");
				livro1.setDescricao("o começo");
								
				Livro livro2 = new Livro();
				livro2.setAutor("ze");
				livro2.setDescricao("enrolação");
				livro2.setTitulo("vol 2");
				
				Livro livro3 = new Livro();
				livro3.setAutor("zezinho");
				livro3.setDescricao("meio");
				livro3.setTitulo("vol 3");
				
				Livro livro4 = new Livro();
				livro4.setAutor("zezão");
				livro4.setDescricao("quase no fim");
				livro4.setTitulo("vol 4");
				
				Livro livro5 = new Livro();
				livro5.setAutor("mestre ze");
				livro5.setDescricao("finish him");
				livro5.setTitulo("end chapter");
				
				List<Livro> lista = new ArrayList<Livro>();
				
				lista.add(livro1);
				lista.add(livro2);
				lista.add(livro3);
				lista.add(livro4);
				lista.add(livro5);

				request.setAttribute("listaLivro", lista);
				
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/listaLivro.jsp");
				rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
