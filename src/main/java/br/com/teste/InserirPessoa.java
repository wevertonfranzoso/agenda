package br.com.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.dao.PessoaDAO;
import br.com.entity.Pessoa;

public class InserirPessoa {
	
	public static void main(String[] args) throws Exception {
		
		
		EntityManager em = Persistence.createEntityManagerFactory("agenda-crud").createEntityManager();
		
		PessoaDAO pessoaDao = new PessoaDAO(em);
		
		Pessoa entidade = new Pessoa(3, "Joao", 21212121,"Rua tal", "teste@teste.com" );
		pessoaDao.cadastrar(entidade);
		
		
		Pessoa entidade2 = new Pessoa(4, "maria", 21212121,"Rua Francs", "teste@teste.com");
		pessoaDao.cadastrar(entidade2);

		pessoaDao.commit();
		
		
	}
	
}
