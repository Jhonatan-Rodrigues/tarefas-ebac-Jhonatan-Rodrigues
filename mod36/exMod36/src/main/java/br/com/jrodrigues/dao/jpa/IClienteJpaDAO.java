package br.com.jrodrigues.dao.jpa;

import br.com.jrodrigues.dao.generic.jpa.IGenericJpaDAO;
import br.com.jrodrigues.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long>{

}
