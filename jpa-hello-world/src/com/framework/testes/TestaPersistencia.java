package com.framework.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.framework.model.Pessoa;

public class TestaPersistencia {

	static PessoaDao pessoaDao = PessoaDao.getInstance();

	public static void main(String[] args) {

		incluirPessoa();

		pessoaDao.findAll();

		listarTodasPessoas();

	}

	private static void incluirPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("12345678903");
		pessoa.setNome("dudu");

		pessoaDao.persist(pessoa);
	}

	private static void listarTodasPessoas() {
		List<Pessoa> todasPessoaJPA = pessoaDao.findAll();
		for (Pessoa pessoaLaco : todasPessoaJPA) {
			// implementar toString()
			System.out.println(pessoaLaco);

		}
	}

	private static void alterarPessoa() {
		Pessoa pessoaAlterar = pessoaDao.getById(2);
		pessoaAlterar.setNome("lili");

		pessoaDao.merge(pessoaAlterar);
	}
	
}
