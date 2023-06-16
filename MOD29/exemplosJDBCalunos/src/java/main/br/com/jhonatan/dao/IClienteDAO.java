package br.com.jhonatan.dao;

import java.util.List;

import br.com.jhonatan.domain.Cliente;

public interface IClienteDAO {

	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo)throws Exception;

	public Integer excluir(Cliente clienteDB)throws Exception;

	public List<Cliente> buscarTodos()throws Exception;
	
	public Integer atualizar(Cliente clienteDB) throws Exception;

}
