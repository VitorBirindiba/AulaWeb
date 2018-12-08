package com.framework.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.framework.db.UsuarioDAO;
import com.framework.model.Usuario;

@ViewScoped
@ManagedBean
public class UsuarioManagedBean {
	
	private UsuarioDAO usuarioDao = new UsuarioDAO();
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarioListDB = new ArrayList<>();
	
	public List getUsuarioListDb() {
		return usuarioDao.listarUsuarios();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
 
}
