package application;

import entities.Pessoas;

import java.util.*;

public class Program {

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

        pessoas.stream().filter(pessoas1 -> pessoas1.getSexo()
                        .equals("F"))
                .forEach(System.out::println);


    }

}



