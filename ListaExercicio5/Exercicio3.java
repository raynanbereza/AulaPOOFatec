import java.util.Scanner;

public class Exercicio3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numero = lerNumero();

        boolean par = ehPar(numero);

        mostrarResultado(par);
    }

    public static int lerNumero() {
        System.out.print("Digite um número: ");
        return sc.nextInt();
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void mostrarResultado(boolean par) {

        if (par) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}