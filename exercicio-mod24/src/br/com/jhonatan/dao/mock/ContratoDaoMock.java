package br.com.jhonatan.dao.mock;

import br.com.jhonatan.dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {
    @Override
    public void salvar() {

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
