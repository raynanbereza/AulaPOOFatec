import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        mostrarMenu();

        int jogador = jogadaJogador();
        int computador = jogadaComputador();

        int vencedor =
                verificarVencedor(
                        jogador,
                        computador);

        mostrarResultado(
                jogador,
                computador,
                vencedor);
    }

    public static void mostrarMenu() {

        System.out.println("1-Pedra");
        System.out.println("2-Papel");
        System.out.println("3-Tesoura");
    }

    public static int jogadaJogador() {
        return sc.nextInt();
    }

    public static int jogadaComputador() {
        return new Random().nextInt(3) + 1;
    }

    public static int verificarVencedor(
            int j,
            int c) {

        if (j == c) return 0;

        if ((j == 1 && c == 3)
                || (j == 2 && c == 1)
                || (j == 3 && c == 2))
            return 1;

        return 2;
    }

    public static void mostrarResultado(
            int j,
            int c,
            int vencedor) {

        System.out.println("Jogador: " + j);
        System.out.println("Computador: " + c);

        if (vencedor == 0)
            System.out.println("Empate");
        else if (vencedor == 1)
            System.out.println("Jogador venceu");
        else
            System.out.println("Computador venceu");
    }
}