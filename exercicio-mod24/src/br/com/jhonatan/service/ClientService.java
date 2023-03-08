package br.com.jhonatan.service;

import br.com.jhonatan.dao.IClientDao;

public class ClientService {
    private IClientDao clienteDao;
    public ClientService(IClientDao clienteDao){
//        new ClienteDao();
        this.clienteDao = clienteDao;
    }
    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }

    public String buscar(){
        clienteDao.buscar();
        return  "Registro encontrado";
    }
    public String excluir(){
        clienteDao.excluir();
        return "deletado";
    }
    public String atualizar(){
        clienteDao.atualizar();
        return "atualização concluida";
    }
}
