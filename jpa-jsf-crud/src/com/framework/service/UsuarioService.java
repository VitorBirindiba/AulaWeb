package com.framework.service;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.validation.ValidationException;

import com.framework.db.UsuarioDAO;
import com.framework.model.Usuario;

@ManagedBean(name = "usuarioService")
@ApplicationScoped
public class UsuarioService {

	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public void telaEdicao(Usuario usuario) throws ValidationException{
		if (!usuario.getMatricula().startsWith("ADM")) {
			throw new ValidationException("Somente usuário com perfil ADM podem acessar a página de edição");
		}
	}

	public  Usuario consultarUsuario(Integer idUsuarioLogado) {
		return usuarioDAO.consultarUsuario(idUsuarioLogado);
	}

}
