    import java.util.Scanner;

class Ex16_TranspostaMatriz{
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

    int[][] transposta = new int[3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            transposta[i][j] = A[j][i];
        }
    }

    System.out.println("A matriz transposta é:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(transposta[i][j] + " ");
        }
        System.out.println();
    }

    scanner.close();
}
}

