package com.framework.mb;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.framework.db.UsuarioDAO;
import com.framework.model.Usuario;

@ViewScoped
@ManagedBean(name="cardLoginMB")
public class CardLoginManagedBen {
	
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	private Usuario usuario = new Usuario(); //getters and setters
	
	public String enviar() {
		apiRecebeDadosCartao();
		
		usuario = usuarioDAO.getUsuarioCard(usuario.getNomeUsuario(), usuario.getMatricula());
		if(usuario == null) {
			usuario = new Usuario();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Cartão não aceito", "Erro no login!"));
			return null;
		} else {
			return "/acessoLiberado";
		}
	}

	private void apiRecebeDadosCartao() {
		String nomeUsuario = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nomeUsuario");
		String matricula = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("matricula");
		
		usuario.setNomeUsuario(nomeUsuario);
		usuario.setMatricula(matricula);
	}
}
