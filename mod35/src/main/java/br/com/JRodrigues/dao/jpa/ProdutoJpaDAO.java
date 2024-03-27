package br.com.JRodrigues.dao.jpa;

import br.com.JRodrigues.dao.generics.jpa.GenericJpaDAO;
import br.com.JRodrigues.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
