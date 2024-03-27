package br.com.JRodrigues.services.generics.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.JRodrigues.dao.Persistente;
import br.com.JRodrigues.dao.generics.jpa.IGenericJpaDAO;
import br.com.JRodrigues.exception.DAOException;
import br.com.JRodrigues.exception.MaisDeUmRegistroException;
import br.com.JRodrigues.exception.TableException;
import br.com.JRodrigues.exception.TipoChaveNaoEncontradaException;

public abstract class GenericJpaService<T extends Persistente, E extends Serializable>
		implements IGenericJpaService<T, E> {

	protected IGenericJpaDAO<T, E> dao;

	public GenericJpaService(IGenericJpaDAO<T, E> dao) {
		this.dao = dao;
	}

	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}

}
