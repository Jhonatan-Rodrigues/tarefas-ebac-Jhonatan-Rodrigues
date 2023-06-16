package br.com.jhonatan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.jhonatan.dao.IProdutoDAO;
import br.com.jhonatan.dao.ProdutoDAO;
import br.com.jhonatan.domain.Produto;

public class ProdutoTest {
	
	@Test
	public void cadastrarTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("computador");

		Integer qtd = dao.inserir(produto);
		assertTrue(qtd == 1);
		
		Produto produtoBD = dao.buscar(produto.getCodigo());
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		Integer qtdDel = dao.excluir(produtoBD);
		assertNotNull(qtdDel);
		
	}
	@Test
	public void buscarTodosTest()throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("Computador");
		Integer count = dao.inserir(produto);
		assertTrue(count == 1);
		
		Produto produto1 = new Produto();
		produto1.setCodigo("02");
		produto1.setNome("Smartphone");
		Integer count2 = dao.inserir(produto1);
		assertTrue(count2 == 1);
		
		List<Produto> list = dao.buscarTodos();
		assertNotNull(list);
		assertTrue(list.size() == 2);
		
		int countDel = 0;
		for(Produto pro: list ) {
			dao.excluir(pro);
			countDel++;
		}
		assertEquals(list.size(), countDel);
		
		list = dao.buscarTodos();
		assertEquals(list.size(), 0);
		
		
		
	}
	
	@Test
	public void atualizarTest() throws Exception {
		IProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("Margarina");
		Integer cont = produtoDAO.inserir(produto);
		assertTrue(cont == 1);
		
		
		Produto produtoBD = produtoDAO.buscar("01");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		produtoBD.setCodigo("02");
		produto.setNome("Manteiga");
		Integer contAtual = produtoDAO.atualizar(produtoBD);
		assertTrue(contAtual == 1);
		
		Produto produtoBD1 = produtoDAO.buscar("01");
		assertNull(produtoBD1);
		
		Produto produtoBD2 = produtoDAO.buscar("02");
		assertNotNull(produtoBD2);
		assertEquals(produtoBD.getId(), produtoBD2.getId());
		assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
		assertEquals(produtoBD.getNome(), produtoBD2.getNome());
		
		List<Produto> list = produtoDAO.buscarTodos();
		for (Produto pro : list) {
			produtoDAO.excluir(pro);
			
		}
	}
		
	}

