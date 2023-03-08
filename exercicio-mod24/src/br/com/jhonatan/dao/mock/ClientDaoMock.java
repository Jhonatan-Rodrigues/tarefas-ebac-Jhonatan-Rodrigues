package br.com.jhonatan.dao.mock;

import br.com.jhonatan.dao.IClientDao;

public class ClientDaoMock implements IClientDao {
    @Override
    public String salvar() {
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "registro encontrado";
    }

    @Override
    public String excluir() {
        return "deletado";
    }

    @Override
    public String atualizar() {
        return "atualização concluida";
    }
}
