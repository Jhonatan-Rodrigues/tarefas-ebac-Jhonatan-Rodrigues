package application;

import cadastro.Clientes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        clienteMasculino();
        clienteFeminina();

    }

    private static void clienteMasculino() {
        List<Clientes> clientes = new ArrayList<>();

        Clientes c1 = new Clientes("Jhonatan", 'M');
        Clientes c2 = new Clientes("Natalia", 'F');
        Clientes c3 = new Clientes("Leticia", 'F');
        Clientes c4 = new Clientes("Odair", 'M');

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);

        System.out.println("**** imprimindo sexo masculino ****");
        for (Clientes cs : clientes) {
            if (cs.getSexo() == 'M') {
                System.out.println(cs.getNome());
            }
        }
    }

    private static void clienteFeminina() {
        System.out.println("");
        List<Clientes> clientes = new ArrayList<>();

        Clientes c1 = new Clientes("Jhonatan", 'M');
        Clientes c2 = new Clientes("Natalia", 'F');
        Clientes c3 = new Clientes("Leticia", 'F');
        Clientes c4 = new Clientes("Odair", 'M');

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);

        System.out.println("**** imprimindo sexo feminino ****");
        for (Clientes cs : clientes) {
            if (cs.getSexo() == 'F') {
                System.out.println(cs.getNome());
            }
        }
    }
}
