package com.framework.filter;

import java.io.IOException;
import java.util.logging.LogRecord;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/restrito/*")
public class LoginFilter implements Filter{
	
	public void destroy() {
		
	}

	public void doFilter ( ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession sessao = ((HttpServletRequest)request).getSession(true);
		//recuperar o atributo logado na sessão
		boolean logado = false;
		if(sessao.getAttribute("logado") !=null) {
			logado = (Boolean) sessao.getAttribute("logado");
		}
		
//		 caso a variavel logado seja false saberemos que o usuario não está logado
		
		if (!logado) {
			String contextPath = ((HttpServletRequest) request).getContextPath();
			
//			redirecionamos o usuário imediatamente para a pagina de login.xhtml
			((HttpServletResponse) response).sendRedirect(contextPath + "/login/login.xhtml");
		}else {
//			caso ele esteja logado, apenas deixamos que o fluxo continue 
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
