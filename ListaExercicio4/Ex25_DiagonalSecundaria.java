import java.util.Scanner;

class Ex25_DiagonalSecundaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaSecundaria = 0;

        // 1. Entrada de dados
        System.out.println("--- Soma da Diagonal Secundária (Matriz 3x3) ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor para [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // 2. Lógica para a Diagonal Secundária
        // A condição para um elemento pertencer à diagonal secundária é: (i + j) == (tamanho - 1)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    somaSecundaria += matriz[i][j];
                }
            }
        }

        // 3. Exibição da Matriz para conferência
        System.out.println("\nMatriz Digitada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // 4. Resultado final
        System.out.println("\n-------------------------------------------");
        System.out.println("A soma da diagonal secundária é: " + somaSecundaria);
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}