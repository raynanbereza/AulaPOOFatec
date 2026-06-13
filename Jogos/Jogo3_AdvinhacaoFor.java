import java.util.Scanner;

public class Jogo3_AdvinhacaoFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int tentativasMax = 10;
        boolean acertou = false;

        System.out.println("=== JOGO DA ADIVINHAÇÃO (FOR) ===");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        for (int tentativa = 1; tentativa <= tentativasMax; tentativa++) {

            System.out.print("Tentativa " + tentativa + ": ");
            int palpite = sc.nextInt();

            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior!");
            } else {
                System.out.println("Você acertou!");
                acertou = true;
                break;
            }
        }

        if (!acertou) {
            System.out.println("Fim das tentativas!");
            System.out.println("O número secreto era: " + numeroSecreto);
        }

        sc.close();
    }
}