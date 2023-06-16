package br.com.jhonatan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jhonatan.dao.generic.jdbc.ConnectionFactory;
import br.com.jhonatan.domain.Cliente;

public class ClienteDAO implements IClienteDAO {

	@Override
	public Integer cadastrar(Cliente cliente) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;

		try {
			connection = ConnectionFactory.getConnection();
			String sql = "INSERT INTO TB_CLIENTE_2(ID, CODIGO, NOME) " + "VALUES (nextval('sq_cliente2'), ?, ?)";
			stm = connection.prepareStatement(sql);
			stm.setString(1, cliente.getCodigo());
			stm.setString(2, cliente.getNome());
			return stm.executeUpdate();

		} catch (Exception e) {
			throw e;

		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}

		}
	}

	@Override
	public Cliente consultar(String codigo) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Cliente cliente = null;

		try {
			connection = ConnectionFactory.getConnection();
			String sql = "select * from tb_cliente_2 where codigo = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1, codigo);
			rs = stm.executeQuery();
			if (rs.next()) {
				cliente = new Cliente();
				cliente.setId(rs.getLong("id"));
				cliente.setCodigo(rs.getString("codigo"));
				cliente.setNome(rs.getString("nome"));
			}
			return cliente;

		} catch (Exception e) {
			throw e;

		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}

	}

	@Override
	public Integer excluir(Cliente cliente) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;

		try {
			connection = ConnectionFactory.getConnection();
			String sql = "DELETE FROM TB_CLIENTE_2 WHERE CODIGO = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1, cliente.getCodigo());
			return stm.executeUpdate();

		} catch (Exception e) {
			throw e;

		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}

	}

	@Override
	public List<Cliente> buscarTodos() throws Exception {
		
		
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		List<Cliente> list = new ArrayList<>();
		Cliente cliente = null;

		try {
		connection = ConnectionFactory.getConnection();
		String sql = "select * from tb_cliente_2";
		stm = connection.prepareStatement(sql);
		rs = stm.executeQuery();
		
		while (rs.next()) {
			cliente = new Cliente();
			Long id = rs.getLong("id");
			String codigo = rs.getString("codigo");
			String nome = rs.getString("nome");
			cliente.setId(id);
			cliente.setCodigo(codigo);
			cliente.setNome(nome);
			list.add(cliente);
		}
		
		}

	 catch (Exception e){
		throw e;

	} finally {
		if (stm != null && !stm.isClosed()) {
			stm.close();
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
	
	}
	return list;

	
	}

	@Override
	public Integer atualizar(Cliente cliente) throws Exception {
		
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "UPDATE tb_cliente_2 SET nome = ?, "
					+ "codigo = ? WHERE id = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1,cliente.getNome());
			stm.setString(2, cliente.getCodigo());
			stm.setLong(3, cliente.getId());
			return stm.executeUpdate();
			
			}catch (Exception e){
				throw e;

			} finally {
				if (stm != null && !stm.isClosed()) {
					stm.close();
				}
				if (connection != null && !connection.isClosed()) {
					connection.close();
				}
			
			}
	}
	}
