public class Conta {

    //inicio da criação dos métodos//
    private String titular;
    private int numDaConta;
    private Double saldo;

    //criando getters e setters//
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumDaConta() {
        return numDaConta;
    }

    public void setNumDaConta(int numDaConta) {
        this.numDaConta = numDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
