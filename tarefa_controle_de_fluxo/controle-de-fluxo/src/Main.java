public class Main {
    public static void main(String[] args) {


        int nota1 = 10;
        int nota2 = 7;
        int nota3 = 6;
        int nota4 = 10;

        //mudei para double a variavel total para sair melhor formatada no console a média//
        double subtotal = nota1 + nota2 +nota3 +nota4;

        double total = subtotal / 4;
        System.out.println("Sua média de notas é: "+total);


        if(total >= 7){
            System.out.println("Parabéns você foi aprovado");
        } else if (total >= 5) {
            System.out.println("Você está de recuperação");
        }
        else {
            System.out.println("Você foi reprovado");
        }
    }
}