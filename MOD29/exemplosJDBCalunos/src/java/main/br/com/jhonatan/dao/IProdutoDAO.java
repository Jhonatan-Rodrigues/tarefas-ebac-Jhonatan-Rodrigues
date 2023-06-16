package br.com.jhonatan.dao;

import java.util.List;

import br.com.jhonatan.domain.Cliente;
import br.com.jhonatan.domain.Produto;

public interface IProdutoDAO {

	
	public Integer inserir(Produto produto) throws Exception;

	public Produto buscar(String codigo)throws Exception;

	public Integer excluir(Produto produtoDB)throws Exception;

	public List<Produto> buscarTodos()throws Exception;
	
	public Integer atualizar(Produto produtoDB) throws Exception;
}
