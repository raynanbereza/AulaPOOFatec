import java.util.Scanner;

class Ex20_SomaLinhaEColunaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][3];

        // 1. Entrada de dados
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // 2. Exibição da Matriz
        System.out.println("\n--- Matriz A ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "\t"); // \t para alinhar as colunas
            }
            System.out.println();
        }

        // 3. Cálculo e exibição das Somas das Linhas
        System.out.println("\n--- Soma das Linhas ---");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0; // Reinicia a soma para cada nova linha
            for (int j = 0; j < 3; j++) {
                somaLinha += A[i][j];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }

        // 4. Cálculo e exibição das Somas das Colunas
        System.out.println("\n--- Soma das Colunas ---");
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0; // Reinicia a soma para cada nova coluna
            for (int i = 0; i < 3; i++) {
                somaColuna += A[i][j];
            }
            System.out.println("Coluna " + j + ": " + somaColuna);
        }

        scanner.close();
    }
}