package br.com.jhonatan.dao;

public class ClienteDao implements IClientDao {

    public String salvar(){
        throw new UnsupportedOperationException("Não funciona sem configurar o banco");
        //return "Sucesso";
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
