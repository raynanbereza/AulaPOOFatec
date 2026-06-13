import java.util.Scanner;

public class Exercicio14 {

    static Scanner sc = new Scanner(System.in);
    static double saldo = 1000;

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

        encerrarSistema();
    }

    public static void mostrarMenu() {

        System.out.println("\n1-Depositar");
        System.out.println("2-Sacar");
        System.out.println("3-Saldo");
        System.out.println("4-Sair");
    }

    public static void depositar() {
        saldo += sc.nextDouble();
    }

    public static void sacar() {
        saldo -= sc.nextDouble();
    }

    public static void consultarSaldo() {
        System.out.println("Saldo = " + saldo);
    }

    public static void encerrarSistema() {
        System.out.println("Sistema encerrado.");
    }
}