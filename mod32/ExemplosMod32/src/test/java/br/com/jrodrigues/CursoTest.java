package br.com.jrodrigues;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.jrodrigues.dao.CursoDao;
import br.com.jrodrigues.dao.ICursoDao;
import br.com.jrodrigues.domain.Curso;

public class CursoTest {
	
	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TEST");
		curso.setNome("Curso de Java Back End");
		curso = cursoDao.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
		
	}

}
