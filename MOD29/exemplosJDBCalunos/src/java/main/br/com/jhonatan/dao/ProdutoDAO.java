package br.com.jhonatan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jhonatan.dao.generic.jdbc.ConnectionFactory;
import br.com.jhonatan.domain.Produto;

public class ProdutoDAO implements IProdutoDAO{


	@Override
	public Integer inserir(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "insert into tb_produto_2(id, codigo, nome) values (nextval('sq_produto2'), ?, ?)";
			stm = connection.prepareStatement(sql);
			stm.setString(1, produto.getCodigo());
			stm.setString(2, produto.getNome());
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
	public Produto buscar(String codigo) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "select * from tb_produto_2 where codigo = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1, codigo);
			rs = stm.executeQuery();
			if (rs.next()) {
				produto = new Produto();
				produto.setId(rs.getLong("id"));
				produto.setCodigo(rs.getString("codigo"));
				produto.setNome(rs.getString("nome"));				
			}
			return produto;
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
	public Integer excluir(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "delete from tb_produto_2 where codigo = ?;";
			stm = connection.prepareStatement(sql);
			stm.setString(1, produto.getCodigo());
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
	public List<Produto> buscarTodos() throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		List<Produto> list = new ArrayList<>();
		Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "select * from tb_produto_2";
			stm = connection.prepareStatement(sql);
			rs = stm.executeQuery();
			
			while (rs.next()) {
				produto = new Produto();
				Long id = rs.getLong("Id");
				String nome = rs.getString("Nome");
				String codigo = rs.getString("Codigo");
				produto.setId(id);
				produto.setNome(nome);
				produto.setCodigo(codigo);
				list.add(produto);
			}
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
		return list;
	}

	@Override
	public Integer atualizar(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "UPDATE tb_produto_2 SET nome = ?, codigo = ? WHERE id = ?";
			stm = connection.prepareStatement(sql);
			stm.setString(1,  produto.getNome());
			stm.setString(2, produto.getCodigo());
			stm.setLong(3, produto.getId());
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
	


}
