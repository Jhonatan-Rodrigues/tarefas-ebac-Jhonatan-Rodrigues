public class Programa {

    //inicio do método main//
    public static void main(String[] args) {

        //instanciando a classe conta//
        Conta conta = new Conta();
        conta.setNumDaConta(123456);
        conta.setTitular("Jhonatan Rodrigues");
        conta.setSaldo(200.00);

        System.out.println(conta.getNumDaConta());
        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());

    }
}
