    import java.util.Scanner;

class Ex17_MultiplicacaoEscalarMatriz{
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    int[][] A = new int[3][3];
    System.out.println("Digite os valores para a matriz 3x3:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            A[i][j] = scanner.nextInt();
        }
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(A[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Digite o valor escalar para a multiplicação:");
    int escalar = scanner.nextInt();
    int[][] resultado = new int[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            resultado[i][j] = A[i][j] * escalar;
        }
    }

    System.out.println("A matriz resultante é:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(resultado[i][j] + " ");
        }
        System.out.println();
    }

    scanner.close();
}
}

