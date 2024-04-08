package br.com.jrodrigues.dao.jpa;

import br.com.jrodrigues.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.jrodrigues.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
