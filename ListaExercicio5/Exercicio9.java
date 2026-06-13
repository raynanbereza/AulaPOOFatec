import java.util.Scanner;

public class Exercicio9 {

    static Scanner sc = new Scanner(System.in);
    static double saldo = 0;

    public static void main(String[] args) {

        int opcao;

        do {

            mostrarMenu();
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    depositar();
                    break;

                case 2:
                    sacar();
                    break;

                case 3:
                    consultarSaldo();
                    break;
            }

        } while (opcao != 4);
    }

    public static void mostrarMenu() {

        System.out.println("\n1- Depositar");
        System.out.println("2- Sacar");
        System.out.println("3- Consultar");
        System.out.println("4- Sair");
    }

    public static void depositar() {

        System.out.print("Valor: ");
        saldo += sc.nextDouble();
    }

    public static void sacar() {

        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    public static void consultarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}