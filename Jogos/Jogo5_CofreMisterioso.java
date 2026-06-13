import java.util.Random;
import java.util.Scanner;

public class Jogo5_CofreMisterioso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean continuar = true;
        int pontuacao = 0;

        System.out.println("=================================");
        System.out.println("     COFRE MISTERIOSO");
        System.out.println("=================================");

        while (continuar) {

            int maximo;

            System.out.println("\nEscolha a dificuldade:");
            System.out.println("1 - Fácil (1 a 20)");
            System.out.println("2 - Médio (1 a 50)");
            System.out.println("3 - Difícil (1 a 100)");

            int dificuldade;

            while (true) {

                System.out.print("Opção: ");

                if (sc.hasNextInt()) {

                    dificuldade = sc.nextInt();

                    if (dificuldade >= 1 && dificuldade <= 3) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.out.println("Opção inválida!");
            }

            if (dificuldade == 1) {
                maximo = 20;
            } else if (dificuldade == 2) {
                maximo = 50;
            } else {
                maximo = 100;
            }

            int codigoSecreto = random.nextInt(maximo) + 1;
            boolean acertou = false;
            int tentativas = 5;

            System.out.println("\nO cofre foi trancado!");
            System.out.println("Adivinhe o código entre 1 e " + maximo);

            for (int i = 1; i <= tentativas; i++) {

                int palpite;

                while (true) {

                    System.out.print("\nTentativa " + i + "/" + tentativas + ": ");

                    if (sc.hasNextInt()) {
                        palpite = sc.nextInt();
                        break;
                    }

                    System.out.println("Digite apenas números!");
                    sc.next();
                }

                if (palpite == codigoSecreto) {

                    System.out.println("\n🔓 Cofre aberto!");
                    System.out.println("Código: " + codigoSecreto);

                    pontuacao += 10;
                    acertou = true;
                    break;

                } else if (palpite < codigoSecreto) {

                    System.out.println("O código é MAIOR.");

                } else {

                    System.out.println("O código é MENOR.");
                }

                System.out.println("Restam " + (tentativas - i) + " tentativa(s).");

                pontuacao -= 2;

                if (pontuacao < 0) {
                    pontuacao = 0;
                }
            }

            if (!acertou) {

                System.out.println("\n❌ Você perdeu!");
                System.out.println("O código secreto era: " + codigoSecreto);
            }

            System.out.println("Pontuação atual: " + pontuacao);

            String resposta;

            do {

                System.out.print("\nDeseja jogar novamente? (s/n): ");
                resposta = sc.next().toLowerCase();

                if (!resposta.equals("s") && !resposta.equals("n")) {
                    System.out.println("Digite apenas 's' ou 'n'.");
                }

            } while (!resposta.equals("s") && !resposta.equals("n"));

            if (resposta.equals("n")) {
                continuar = false;
            }
        }

        System.out.println("\n====================");
        System.out.println("Pontuação final: " + pontuacao);
        System.out.println("Fim do jogo!");
        System.out.println("====================");

        sc.close();
    }
}