package aplication;

import entities.Pessoas;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramTest {

    @Test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoas> pessoas = new ArrayList<>();

        System.out.println("Digite o nome e o sexo da pessoa representado pro 'F' ou 'M'");
        System.out.println("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            String sexo = sc.next();
            Pessoas pessoas1 = new Pessoas(nome, sexo);
            pessoas.add(pessoas1);
        }



        for (Pessoas grupo: pessoas) {
            System.out.println("Nome: "+grupo.getNome()+", sexo: "+grupo.getSexo());
            pessoas.stream().filter(pessoas1 -> pessoas1.getSexo()
                            .equals("F")).map(Pessoas::getSexo);
            Assert.assertEquals("F", grupo.getSexo());

        }
    }

}







