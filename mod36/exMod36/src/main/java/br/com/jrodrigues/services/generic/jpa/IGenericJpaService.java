package br.com.jrodrigues.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.jrodrigues.domain.jpa.Persistente;
import br.com.jrodrigues.exception.DAOException;
import br.com.jrodrigues.exception.MaisDeUmRegistroException;
import br.com.jrodrigues.exception.TableException;
import br.com.jrodrigues.exception.TipoChaveNaoEncontradaException;

public interface IGenericJpaService <T extends Persistente, E extends Serializable> {
	
	
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

   
    public void excluir(T entity) throws DAOException;

    
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

   
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

   
    public Collection<T> buscarTodos() throws DAOException;

}
