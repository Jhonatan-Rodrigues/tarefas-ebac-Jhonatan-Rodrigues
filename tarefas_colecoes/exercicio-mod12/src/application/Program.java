package application;

import entities.Pessoas;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        ordernaNomes();
        feminino();
        masculino();
    }

    public static void ordernaNomes() {
        System.out.println("*** imprimindo lista de nomes ordenada ***");
        String nomes = "Leticia, Jhonatan, Odair, Natalia, Maria, Ana";
        String[] ordena = nomes.split(", ");
        Arrays.sort(ordena);
        for (String ordenando : ordena) {
            System.out.println(ordenando);
        }
    }

    private static void feminino() {
        System.out.println("");
        List<Pessoas> pessoas = new ArrayList<>();

        Pessoas p1 = new Pessoas("Jhonatan", 'M');
        Pessoas p2 = new Pessoas("Natalia", 'F');
        Pessoas p3 = new Pessoas("Leticia", 'F');
        Pessoas p4 = new Pessoas("Odair", 'M');
        Pessoas p5 = new Pessoas("Maria", 'F');
        Pessoas p6 = new Pessoas("Ana", 'F');


        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);


        System.out.println("**** imprimindo sexo feminino ****");
        for (Pessoas ps : pessoas) {
            if (ps.getSexo() == 'F') {
                System.out.println(ps.getNome());
            }
        }
    }

    private static void masculino() {
        System.out.println("");
        List<Pessoas> pessoas = new ArrayList<>();

        Pessoas p1 = new Pessoas("Jhonatan", 'M');
        Pessoas p2 = new Pessoas("Natalia", 'F');
        Pessoas p3 = new Pessoas("Leticia", 'F');
        Pessoas p4 = new Pessoas("Odair", 'M');
        Pessoas p5 = new Pessoas("Maria", 'F');
        Pessoas p6 = new Pessoas("Ana", 'F');


        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);


        System.out.println("**** imprimindo sexo masculino ****");
        for (Pessoas ps : pessoas) {
            if (ps.getSexo() == 'M') {
                System.out.println(ps.getNome());
            }
        }
    }
}

