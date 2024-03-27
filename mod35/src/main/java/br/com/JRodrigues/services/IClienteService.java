package br.com.JRodrigues.services;

import br.com.JRodrigues.domain.Cliente;
import br.com.JRodrigues.exception.DAOException;
import br.com.JRodrigues.services.generics.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}