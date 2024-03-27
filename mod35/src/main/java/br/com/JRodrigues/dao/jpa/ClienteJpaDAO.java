package br.com.JRodrigues.dao.jpa;

import br.com.JRodrigues.dao.generics.jpa.GenericJpaDAO;
import br.com.JRodrigues.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
