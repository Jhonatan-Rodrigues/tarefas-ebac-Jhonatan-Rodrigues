package br.com.jrodrigues.dao.jpa;

import br.com.jrodrigues.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.jrodrigues.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}