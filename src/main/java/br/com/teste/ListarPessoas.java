package br.com.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.dao.PessoaDAO;
import br.com.entity.Pessoa;

public class ListarPessoas {
	
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("agenda-crud")
				.createEntityManager();
		
		PessoaDAO pessoaDao = new PessoaDAO(em);
		
		List<Pessoa> lista = pessoaDao.listar();
		
		for (Pessoa pessoa : lista) {
			
			System.out.println("Id: " + pessoa.getId() + " Nome: " + pessoa.getNome() + " Endereço: " + pessoa.getEndereco() + "telefone: " +pessoa.getTelefone());
			
		}
	}

}
