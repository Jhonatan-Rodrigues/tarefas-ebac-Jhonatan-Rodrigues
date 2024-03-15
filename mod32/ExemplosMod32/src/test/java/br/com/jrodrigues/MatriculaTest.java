package br.com.jrodrigues;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.jrodrigues.dao.IMatriculaDao;
import br.com.jrodrigues.dao.MatriculaDao;
import br.com.jrodrigues.domain.Matricula;

public class MatriculaTest {
	
	private IMatriculaDao matriculaDao;
	
	public MatriculaTest() {
		matriculaDao = new MatriculaDao();
	}
	
	@Test
	public void cadastrar() {
		
		Matricula mat = new Matricula();
		mat.setCodigo("A1");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVO");
		mat.setValor(2000d);
		
		mat = matriculaDao.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
	}

}
