package abstrata;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String dataDeCriacao;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }
    @Override
    public String toString() {
        return "Pessoa Juridica: " + getNome()+
                "\ncnpj = "+ cnpj +
                "\nData de nascimento: " + dataDeCriacao;
    }
}
