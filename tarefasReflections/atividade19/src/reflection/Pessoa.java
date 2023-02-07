package reflection;

public class Pessoa {
    @Tabela(value = "getNome")
    private String nome;
    @Tabela(value = "getCpf")
    private int cpf;

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
