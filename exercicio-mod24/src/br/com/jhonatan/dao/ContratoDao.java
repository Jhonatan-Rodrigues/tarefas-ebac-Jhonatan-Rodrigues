package br.com.jhonatan.dao;

public class ContratoDao implements IContratoDao{
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
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
