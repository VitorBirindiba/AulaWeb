package com.framework.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.validation.ValidationException;

import com.framework.db.UsuarioDAO;
import com.framework.model.Usuario;
import com.framework.service.UsuarioService;

@ViewScoped
@ManagedBean
public class UsuarioManagedBean {
	
	private final String TELA_NOVO_USUARIO = "/restrito/novoUsuario.xhtml?faces-redirect=true";
	private final String TELA_LISTAGEM_USUARIO = "/restrito/listagemUsuarios?faces-redirect=true";
	private final String TELA_EDITAR_USUARIO = "/restrito/editarUsuario?faces-redirect=true&id=" ;
	
	private UsuarioDAO usuarioDao = new UsuarioDAO();
	private Usuario usuario = new Usuario();
	
	@ManagedProperty("#{usuarioService}")
	private UsuarioService usuarioService;
	
	@PostConstruct
	public void init() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		String idUsuario = facesContext.getExternalContext().getRequestParameterMap().get("id");
		if(idUsuario != null) {
			this.usuario = usuarioDao.consultarUsuario(Integer.parseInt(idUsuario));
		}
	}
	
	public String paginaEditar(Usuario usuario) {
		FacesContext context = FacesContext.getCurrentInstance();
		try {
			
			String id = context.getExternalContext().getSessionMap().get("id").toString();
			if(id !=null) {
				Integer idUsuarioLogado = Integer.parseInt(id);
			//	this.usuario = usuarioDao.consultarUsuario(idUsuarioLogado);
				this.usuario = usuarioService.consultarUsuario(idUsuarioLogado);
			}
			usuarioService.telaEdicao(this.usuario);
		} catch (ValidationException e ) {
			e.printStackTrace();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), null));
			context.getExternalContext().getFlash().setKeepMessages(true);
			
			return TELA_LISTAGEM_USUARIO;
		}
		return TELA_EDITAR_USUARIO +usuario.getId();
	}
	
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
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
