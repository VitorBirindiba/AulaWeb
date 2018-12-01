package com.framework.db;

import java.beans.PersistenceDelegate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UsuarioDAO {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("usuario");
	private EntityManager em = factory.createEntityManager();
	private EntityTransaction transaction = em.getTransaction();
	
	public Usuario getUsuarioCard(String nomeUsuario, String matricula) {
		try {
			Usuario usuario = (Usuario)em.createQuery("SELECT u from Usuario u where u.nomeUsuario = :name and u.matricula =:matricula").setParameter("name", nomeUsuario).setParameter("matricula", matricula).getSingleResult();
			
			return usuario;
			
					
		}
	}
	
	
}
