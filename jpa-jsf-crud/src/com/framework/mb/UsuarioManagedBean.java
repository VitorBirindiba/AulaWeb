package com.framework.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.transaction.Transaction;

import com.framework.db.UsuarioDAO;
import com.framework.model.Usuario;

@ViewScoped
@ManagedBean
public class UsuarioManagedBean {
	
	private UsuarioDAO usuarioDao = new UsuarioDAO();
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarioListDB = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String idUsuario = facesContext.getExternalContext().getRequestParameterMap().get("id");
		if(idUsuario != null) {
			this.usuario = usuarioDao.consultarUsuario(Integer.parseInt(idUsuario));
		}
	}
	
	public String paginaEditar(Usuario usuario) {
		return "/restrito/editarUsuario?faces-redirect=true&id="+usuario.getId();
	}
	
	public List getUsuarioListDb() {
		return usuarioDao.listarUsuarios();
	}
//	public String incluirUsuarioDb( Usuario usuario) {
//		usuarioDao.inserirUsuario(usuario);
//		return "/listagemUsuarios";
//	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
 
	public String editarUsuarioDb (Usuario usuario) {
		usuarioDao.alterarUsuario(usuario);
		return "/restrito/listagemUsuarios?faces-redirect=true"; 
	}
	public void excluirUsuarioDb(Usuario usuario) {
		usuarioDao.deletarUsario(usuario);
	}
	
	public String incluirUsuarioDb(Usuario usuario) {
		if (!usuarioDao.inserirUsuario(usuario)) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro: Usuário já existente!", null));
			return "/restrito/novoUsuario";
		}
		return "/restrito/listagemUsuarios.xhtml?faces-redirect=true";
	}
}
