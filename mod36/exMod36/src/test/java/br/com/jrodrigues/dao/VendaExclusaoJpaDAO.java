package br.com.jrodrigues.dao;

import br.com.jrodrigues.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.jrodrigues.dao.jpa.IVendaJpaDAO;
import br.com.jrodrigues.domain.jpa.VendaJpa;
import br.com.jrodrigues.exception.DAOException;
import br.com.jrodrigues.exception.TipoChaveNaoEncontradaException;

public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}