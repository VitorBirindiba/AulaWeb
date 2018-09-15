package com.web.set;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exercicio-servlet")
public class Servlet extends HttpServlet{ 

		
		private static final long serialVersionUID = 1L;
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String nome = request.getParameter("nome");
			String profissao = request.getParameter("profissao");
			out.println("<html>"
						+ "<body>"
						+ "<h1> "+ "Meu nome é " + nome + "</h1>"
						+ "<h1> "+ "minha profissão é "+ profissao +" </h1>"
						+ "</body></http>");
		}
		protected void doPost (HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException{
			
		}
		
	}
	


