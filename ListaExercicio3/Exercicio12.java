import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.print("Primeiro número: ");
                double a = sc.nextDouble();

                System.out.print("Segundo número: ");
                double b = sc.nextDouble();

                System.out.println("Resultado = " + (a + b));

            } else if (opcao == 2) {

                System.out.print("Primeiro número: ");
                double a = sc.nextDouble();

                System.out.print("Segundo número: ");
                double b = sc.nextDouble();

                System.out.println("Resultado = " + (a - b));

            } else if (opcao == 3) {

                System.out.println("Encerrando...");

            } else {

                System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}