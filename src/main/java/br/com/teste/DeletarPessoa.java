package br.com.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.dao.PessoaDAO;

public class DeletarPessoa {
	
	public static void main(String[] args) throws Exception {
		
		EntityManager em = Persistence.createEntityManagerFactory("agenda-crud")
				.createEntityManager();
		
		PessoaDAO pessoaDao = new PessoaDAO(em);
		
		//remover usuario 2
		pessoaDao.remover(2);
		
		pessoaDao.commit();

		
	}

}
