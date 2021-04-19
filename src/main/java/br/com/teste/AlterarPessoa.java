package br.com.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.dao.PessoaDAO;
import br.com.entity.Pessoa;

public class AlterarPessoa {

	
	public static void main(String[] args) throws Exception {
		
		EntityManager em = Persistence.createEntityManagerFactory("agenda-crud")
				.createEntityManager();
		
		PessoaDAO pessoaDao = new PessoaDAO(em);
		
		Pessoa pessoa = new Pessoa(3, "TESTETSE ", 7777777,"Rua TESTETSTE", "#2es2e3dws3@teste.com" );
		pessoaDao.atualizar(pessoa);
		
		System.out.println(" PESSOA ALTERADA ");
		
		pessoaDao.commit();
	}
}
