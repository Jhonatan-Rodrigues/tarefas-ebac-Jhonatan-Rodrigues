package br.com.jrodrigues.dao.jpa;

import br.com.jrodrigues.dao.generic.jpa.IGenericJpaDAO;
import br.com.jrodrigues.domain.jpa.VendaJpa;
import br.com.jrodrigues.exception.DAOException;
import br.com.jrodrigues.exception.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public VendaJpa consultarComCollection(Long id);
}
