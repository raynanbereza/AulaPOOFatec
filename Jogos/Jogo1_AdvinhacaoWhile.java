import java.util.Scanner;

public class Jogo1_AdvinhacaoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int tentativas = 0;
        int limite = 10;
        boolean acertou = false;

        System.out.println("=== JOGO DA ADIVINHAÇÃO (WHILE) ===");

        while (tentativas < limite && !acertou) {

            tentativas++;

            System.out.print("Tentativa " + tentativas + ": ");
            int palpite = sc.nextInt();

            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior!");
            } else {
                System.out.println("Você acertou!");
                acertou = true;
            }
        }

        if (!acertou) {
            System.out.println("Fim das tentativas!");
            System.out.println("O número secreto era: " + numeroSecreto);
        }

        sc.close();
    }
}