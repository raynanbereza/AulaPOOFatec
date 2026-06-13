import java.util.Scanner;

class Ex24_BuscaEmMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean encontrado = false;

        // 1. Entrada de dados para a matriz
        System.out.println("--- Preenchimento da Matriz 3x3 ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Valor para [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // 2. Número a ser buscado
        System.out.print("\nDigite o número que deseja buscar na matriz: ");
        int numeroBusca = scanner.nextInt();

        // 3. Lógica de Busca e exibição da posição
        System.out.println("\n--- Resultado da Busca ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == numeroBusca) {
                    System.out.printf("Número %d encontrado na Linha: %d, Coluna: %d\n", numeroBusca, i, j);
                    encontrado = true;
                }
            }
        }

        // 4. Caso o número não exista na matriz
        if (!encontrado) {
            System.out.println("O número " + numeroBusca + " não foi encontrado em nenhuma posição da matriz.");
        }

        scanner.close();
    }
}