package abstrata;

public class Programa {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Jhonatan");
        pessoaFisica.setCpf("448.354.998-70");
        pessoaFisica.setDataDeNascimento("21/10/1998");

        System.out.println(pessoaFisica);
        System.out.println();

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Ebac Online");
        pessoaJuridica.setCnpj("18.778.457/0001-97");
        pessoaJuridica.setDataDeCriacao("10/07/2020");
        System.out.println(pessoaJuridica);



    }
}
