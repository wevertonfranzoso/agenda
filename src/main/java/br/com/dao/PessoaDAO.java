package br.com.dao;

import javax.persistence.EntityManager;

import br.com.entity.Pessoa;

public class PessoaDAO extends GenericDAO<Pessoa, Integer> {

	public PessoaDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	

}
