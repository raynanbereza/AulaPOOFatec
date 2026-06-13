import java.util.Scanner;

class Ex22_SudokuVerificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean valido = true;

        System.out.println("--- Verificador de Sudoku (Apenas Scanner) ---");
        
        // 1. Entrada de dados
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // 2. Lógica de Verificação (Compara cada número com os outros)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int atual = matriz[i][j];

                // Verifica se está no intervalo correto
                if (atual < 1 || atual > 9) {
                    valido = false;
                }

                // Compara o elemento atual com todos os outros da matriz
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        // Não compara o número com ele mesmo (mesma posição)
                        if (!(i == x && j == y)) {
                            if (atual == matriz[x][y]) {
                                valido = false;
                            }
                        }
                    }
                }
            }
        }

        // 3. Exibição da Matriz
        System.out.println("\nMatriz Resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // 4. Resultado
        if (valido) {
            System.out.println("\nResultado: VÁLIDO (Sem repetições)");
        } else {
            System.out.println("\nResultado: INVÁLIDO (Há repetições ou números fora de 1-9)");
        }

        scanner.close();
    }
}