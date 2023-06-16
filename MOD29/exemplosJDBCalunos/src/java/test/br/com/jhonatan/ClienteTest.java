/**
 * 
 */
package br.com.jhonatan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.jhonatan.dao.ClienteDAO;
import br.com.jhonatan.dao.IClienteDAO;
import br.com.jhonatan.domain.Cliente;

/**
 * @author jhowt
 *
 */
public class ClienteTest {

	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Jhonatan Rodrigues");

		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteDB = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteDB);
		assertNotNull(clienteDB.getId());
		assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
		assertEquals(cliente.getNome(), clienteDB.getNome());
		
		Integer qtdDel = dao.excluir(clienteDB);
		assertNotNull(qtdDel);
		
	}
	@Test
	public void buscarTodosTest()throws Exception {
		IClienteDAO dao = new ClienteDAO();
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Jhonatan Rodrigues");
		Integer count = dao.cadastrar(cliente);
		assertTrue(count == 1);
		
		Cliente cliente1 = new Cliente();
		cliente1.setCodigo("02");
		cliente1.setNome("Natalia Rodrigues");
		Integer count2 = dao.cadastrar(cliente1);
		assertTrue(count2 == 1);
		
		List<Cliente> list = dao.buscarTodos();
		assertNotNull(list);
		assertTrue(list.size() == 2);
		
		int countDel = 0;
		for(Cliente clie: list ) {
			dao.excluir(clie);
			countDel++;
		}
		assertEquals(list.size(), countDel);
		
		list = dao.buscarTodos();
		assertEquals(list.size(), 0);
		
		
		
	}
	
	@Test
	public void atualizarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Jhonatan Rodrigues");
		Integer count = dao.cadastrar(cliente);
		assertTrue(count == 1);
		
		Cliente clienteDB = dao.consultar("01");
		assertNotNull(clienteDB);
		assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
		assertEquals(cliente.getNome(), clienteDB.getNome());

		clienteDB.setCodigo("24");
		clienteDB.setNome("Manoela");
		Integer contAtual = dao.atualizar(clienteDB);
		assertTrue(contAtual == 1);
		
		Cliente clienteBD1 = dao.consultar("01");
		assertNull(clienteBD1);
		
		Cliente clienteBD2 = dao.consultar("24");
		assertNotNull(clienteBD2);
		assertEquals(clienteDB.getId(), clienteBD2.getId());
		assertEquals(clienteDB.getCodigo(), clienteBD2.getCodigo());
		assertEquals(clienteDB.getNome(), clienteBD2.getNome());
		
		List<Cliente> list = dao.buscarTodos();
		for (Cliente cli : list) {
			dao.excluir(cli);
			
		} 
		
	}
	
}
