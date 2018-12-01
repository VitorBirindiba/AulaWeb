package com.framework.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.framework.model.Pessoa;

public class PessoaDao {

	EntityManager entityManager;

	// Nossa classe PessoaDao segue o padrão de projeto
	// Singleton que garante que apenas uma instância dessa
	// classe seja criada durante toda a aplicação

	private static PessoaDao instance;

	public static PessoaDao getInstance() {
		if (instance == null) {
			instance = new PessoaDao();
		}
		return instance;
	}

	private PessoaDao() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-hello-world");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	// utilizar o createQuery que recebe um JPQL
	// (Java Persistence Query Language) que é uma alternativa as SQL
	@SuppressWarnings("unchecked")
	public List<Pessoa> findAll() {
		return entityManager.createQuery(" FROM " + Pessoa.class.getName()).getResultList();
	}

	public void persist(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(pessoa);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void merge(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(pessoa);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void remove(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			pessoa = entityManager.find(Pessoa.class, pessoa.getId());
			entityManager.remove(pessoa);
			entityManager.getTransaction().rollback();
		}catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void removeById(final int id) {
		try {
			Pessoa pessoa = getById(id);
			remove(pessoa);
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public Pessoa getById(final int id) {
		return entityManager.find(Pessoa.class, id);
	}

	@Override
	public String toString() {
		return "PessoaDao [entityManager=" + entityManager + "]";
	}
	
}
