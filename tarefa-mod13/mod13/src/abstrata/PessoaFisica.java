package abstrata;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private String dataDeNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica: " + getNome()+
                "\ncpf = "+ cpf +
                "\nData de nascimento: " + dataDeNascimento;
    }
}
