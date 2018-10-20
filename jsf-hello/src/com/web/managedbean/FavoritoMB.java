package com.web.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean (name = "favorito")
public class FavoritoMB implements Serializable{
	private String comida;
	private String bebida;
	private String esporte;
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	public void montarNomeCompleto() {
		this.nome="Vitor de Oliveira Birindiba";
	}
	public String salvar() {
		return "favoritos.xhtml";
	}
		public void padrao() {
			this.bebida="Água";
			this.comida="Carne";
			this.esporte="Corrida";
			this.nome="Vitor de Oliveira Birindiba";
		}
}
