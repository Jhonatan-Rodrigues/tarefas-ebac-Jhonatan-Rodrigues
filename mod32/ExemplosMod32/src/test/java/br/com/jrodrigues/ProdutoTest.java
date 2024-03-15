package br.com.jrodrigues;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.jrodrigues.dao.IProdutoDao;
import br.com.jrodrigues.dao.ProdutoDao;
import br.com.jrodrigues.domain.Produto;

public class ProdutoTest {
	
	IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar() {
		Produto prod = new Produto();
		prod.setCodigo("A1");
		prod.setNome("Computer");
		prod.setPrice(2000d);
		
		produtoDao.cadastrar(prod);
		
		assertNotNull(prod);
		assertNotNull(prod.getId());
		
	}

}
