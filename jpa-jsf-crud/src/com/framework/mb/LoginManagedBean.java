package com.framework.mb;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.framework.db.UsuarioDAO;
import com.framework.model.Usuario;

@ViewScoped
@ManagedBean(name = "loginMB")
public class LoginManagedBean {

	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	private Usuario usuario = new Usuario();
	
	public String enviar() {
		usuario = usuarioDAO.getUsuario(usuario.getNomeUsuario(), usuario.getSenha());
		FacesContext context = FacesContext.getCurrentInstance();
		if(usuario== null) {
			usuario = new Usuario();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario não encontrado!", "Erro no login!"));
			return null;
		}else {
			
			ExternalContext externalContext = context.getExternalContext();
			Map<String, Object> sessionMap = externalContext.getSessionMap();
			sessionMap.put("id", usuario.getId());
			
			externalContext.getSessionMap().put("logado", true);
			
			return "/restrito/listagemUsuarios.xhtml?faces-redirect=true";
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
