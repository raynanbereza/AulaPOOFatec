import java.util.Scanner;

public class Jogo4_DaVelha {

    static char[][] tabuleiro = new char[3][3];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        inicializarTabuleiro();

        char jogadorAtual = 'X';
        boolean jogoTerminou = false;

        while (!jogoTerminou) {

            imprimirTabuleiro();

            System.out.println("\nJogador " + jogadorAtual);

            System.out.print("Digite a linha (1-3): ");
            int linha = sc.nextInt();

            System.out.print("Digite a coluna (1-3): ");
            int coluna = sc.nextInt();

            // Validação de faixa
            if (linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }

            // Ajusta para índice da matriz
            linha--;
            coluna--;

            // Verifica se a posição está ocupada
            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Essa posição já está ocupada!");
                continue;
            }

            // Realiza a jogada
            tabuleiro[linha][coluna] = jogadorAtual;

            // Verifica vitória
            if (verificarVitoria(jogadorAtual)) {
                imprimirTabuleiro();
                System.out.println("\n🎉 Jogador " + jogadorAtual + " venceu!");
                jogoTerminou = true;
            }

            // Verifica empate
            else if (verificarEmpate()) {
                imprimirTabuleiro();
                System.out.println("\n🤝 Empate!");
                jogoTerminou = true;
            }

            // Alterna jogador
            else {
                if (jogadorAtual == 'X') {
                    jogadorAtual = 'O';
                } else {
                    jogadorAtual = 'X';
                }
            }
        }

        sc.close();
    }

    // Inicializa o tabuleiro
    public static void inicializarTabuleiro() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Mostra o tabuleiro
    public static void imprimirTabuleiro() {

        System.out.println("\n    1   2   3");

        for (int i = 0; i < 3; i++) {

            System.out.print((i + 1) + " ");

            for (int j = 0; j < 3; j++) {

                System.out.print(" " + tabuleiro[i][j] + " ");

                if (j < 2) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("   -----------");
            }
        }
    }

    // Verifica vitória
    public static boolean verificarVitoria(char jogador) {

        // Linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador &&
                tabuleiro[i][1] == jogador &&
                tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        // Colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador &&
                tabuleiro[1][i] == jogador &&
                tabuleiro[2][i] == jogador) {
                return true;
            }
        }

        // Diagonal principal
        if (tabuleiro[0][0] == jogador &&
            tabuleiro[1][1] == jogador &&
            tabuleiro[2][2] == jogador) {
            return true;
        }

        // Diagonal secundária
        if (tabuleiro[0][2] == jogador &&
            tabuleiro[1][1] == jogador &&
            tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    // Verifica empate
    public static boolean verificarEmpate() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}