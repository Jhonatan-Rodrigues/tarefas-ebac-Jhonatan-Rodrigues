package br.com.jhonatan.service;

import br.com.jhonatan.dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Registro encontrado";
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
