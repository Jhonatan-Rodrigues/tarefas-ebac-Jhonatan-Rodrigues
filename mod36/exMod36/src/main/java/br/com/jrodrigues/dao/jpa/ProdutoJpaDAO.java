package br.com.jrodrigues.dao.jpa;

import br.com.jrodrigues.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.jrodrigues.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
