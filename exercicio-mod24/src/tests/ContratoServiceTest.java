package tests;

import br.com.jhonatan.dao.ContratoDao;
import br.com.jhonatan.dao.IContratoDao;
import br.com.jhonatan.dao.mock.ContratoDaoMock;
import br.com.jhonatan.service.ContratoService;
import br.com.jhonatan.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){

        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroComSalvarBancoDeDadosTest(){

        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals(null, retorno);
    }
    @Test
    public void buscarTest(){
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Registro encontrado", retorno);
    }
    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("deletado", retorno);
    }
    @Test
    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("atualização concluida", retorno);
    }

}
