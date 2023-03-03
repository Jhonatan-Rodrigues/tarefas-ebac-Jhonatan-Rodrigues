package entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoas {
    private String nome;
    private String sexo;

    public Pessoas(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    public Pessoas(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "nome: " + nome + ", sexo: " + sexo;
    }


}
