import java.util.Scanner;

class Ex23_RotacaoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] original = new int[3][3];
        int[][] rotacionada = new int[3][3];

        // 1. Entrada de dados
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Posição [%d][%d]: ", i, j);
                original[i][j] = scanner.nextInt();
            }
        }

        // 2. Lógica de Rotação (90 graus sentido horário)
        // A regra é: rotacionada[j][2 - i] = original[i][j]
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotacionada[j][2 - i] = original[i][j];
            }
        }

        // 3. Exibição dos resultados
        System.out.println("\n--- Matriz Original ---");
        exibirMatriz(original);

        System.out.println("\n--- Matriz Rotacionada (90°) ---");
        exibirMatriz(rotacionada);

        scanner.close();
    }

    // Método auxiliar para exibir a matriz de forma organizada
    public static void exibirMatriz(int[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}