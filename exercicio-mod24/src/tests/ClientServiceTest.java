package tests;

import br.com.jhonatan.dao.ClienteDao;
import br.com.jhonatan.dao.IClientDao;
import br.com.jhonatan.dao.mock.ClientDaoMock;
import br.com.jhonatan.service.ClientService;
import org.junit.Assert;
import org.junit.Test;

public class ClientServiceTest {

    @Test
    public void salvarTest(){

        ClientDaoMock cliMock = new ClientDaoMock();
        ClientService service = new ClientService(cliMock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvar(){
        IClientDao cliMock = new ClienteDao();
        ClientService service = new ClientService(cliMock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest(){
        IClientDao cli = new ClientDaoMock();
        ClientService service = new ClientService(cli);
        String retorno = service.buscar();
        Assert.assertEquals("Registro encontrado", retorno);
    }
    @Test
    public void excluirTest(){
        IClientDao cli = new ClientDaoMock();
        ClientService service = new ClientService(cli);
        String retorno = service.excluir();
        Assert.assertEquals("deletado", retorno);
    }
    @Test
    public void atualizarTest(){
        IClientDao cli = new ClienteDao();
        ClientService service = new ClientService(cli);
        String retorno = service.atualizar();
        Assert.assertEquals("atualização concluida", retorno);
    }

}
