import java.util.Scanner;

public class Exercicio5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        mostrarMenu();

        int opcao = sc.nextInt();

        double n1 = lerNumero();
        double n2 = lerNumero();

        switch (opcao) {

            case 1:
                System.out.println("Resultado: "
                        + somar(n1, n2));
                break;

            case 2:
                System.out.println("Resultado: "
                        + subtrair(n1, n2));
                break;

            case 3:
                System.out.println("Resultado: "
                        + multiplicar(n1, n2));
                break;

            case 4:
                System.out.println("Resultado: "
                        + dividir(n1, n2));
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    public static void mostrarMenu() {

        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha: ");
    }

    public static double lerNumero() {

        System.out.print("Digite um número: ");
        return sc.nextDouble();
    }

    public static double somar(double a,
                               double b) {
        return a + b;
    }

    public static double subtrair(double a,
                                  double b) {
        return a - b;
    }

    public static double multiplicar(double a,
                                     double b) {
        return a * b;
    }

    public static double dividir(double a,
                                 double b) {
        return a / b;
    }
}