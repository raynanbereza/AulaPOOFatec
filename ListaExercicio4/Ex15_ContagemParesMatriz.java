    import java.util.Scanner;

class Ex15_ContagemParesMatriz{
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

    int contagemPares = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (A[i][j] % 2 == 0) {
                contagemPares++;
            }
        }
    }
    System.out.println("A quantidade de números pares na matriz é: " + contagemPares);

    scanner.close();
}
}

