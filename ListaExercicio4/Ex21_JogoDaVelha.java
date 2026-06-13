import javax.swing.JOptionPane;

class Ex21_JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char jogadorAtual = 'X';
        int jogadas = 0;
        boolean jogoAtivo = true;

        JOptionPane.showMessageDialog(null, "--- BEM-VINDO AO JOGO DA VELHA ---");

        while (jogoAtivo) {
            String statusTabuleiro = formatarTabuleiro(tabuleiro);
            
            // Entrada de dados via Janela de Diálogo
            String entrada = JOptionPane.showInputDialog(null, 
                statusTabuleiro + "\nJogador " + jogadorAtual + "\nDigite a posição (Linha e Coluna ex: 12):");

            // Validação de cancelamento ou entrada vazia
            if (entrada == null) break; 
            
            if (entrada.length() != 2) {
                JOptionPane.showMessageDialog(null, "Digite dois números (ex: 01 para Linha 0, Coluna 1)");
                continue;
            }

            try {
                int linha = Character.getNumericValue(entrada.charAt(0));
                int coluna = Character.getNumericValue(entrada.charAt(1));

                // Validação de limites e posição ocupada
                if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                    JOptionPane.showMessageDialog(null, "Posição inválida ou ocupada!");
                    continue;
                }

                tabuleiro[linha][coluna] = jogadorAtual;
                jogadas++;

                if (verificarVitoria(tabuleiro, jogadorAtual)) {
                    JOptionPane.showMessageDialog(null, formatarTabuleiro(tabuleiro) + "\nVitória do Jogador " + jogadorAtual + "!");
                    jogoAtivo = false;
                } else if (jogadas == 9) {
                    JOptionPane.showMessageDialog(null, formatarTabuleiro(tabuleiro) + "\nEMPATE! Deu velha.");
                    jogoAtivo = false;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na entrada. Use apenas números.");
            }
        }
    }

    // Transforma a matriz em uma String visual para a caixa de diálogo
    public static String formatarTabuleiro(char[][] t) {
        StringBuilder sb = new StringBuilder();
        sb.append("      0     1     2  \n");
        for (int i = 0; i < 3; i++) {
            sb.append(i).append("  [ ").append(t[i][0]).append(" ] [ ").append(t[i][1]).append(" ] [ ").append(t[i][2]).append(" ]\n");
        }
        return sb.toString();
    }

    public static boolean verificarVitoria(char[][] t, char j) {
        for (int i = 0; i < 3; i++) {
            if ((t[i][0] == j && t[i][1] == j && t[i][2] == j) ||
                (t[0][i] == j && t[1][i] == j && t[2][i] == j)) return true;
        }
        return (t[0][0] == j && t[1][1] == j && t[2][2] == j) ||
               (t[0][2] == j && t[1][1] == j && t[2][0] == j);
    }
}