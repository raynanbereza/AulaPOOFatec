    import java.util.Scanner;

class Ex18_SomarDuasMatrizes{
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    int[][] A = new int[3][3];
    int[][] B = new int[3][3];
    int[][] soma = new int[3][3];
    System.out.println("Digite os valores para a primeira matriz 3x3:");
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
    System.out.println("Digite os valores para a segunda matriz 3x3:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            B[i][j] = scanner.nextInt();
        }
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(B[i][j] + " ");
        }
        System.out.println();
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            soma[i][j] = A[i][j] + B[i][j];
        }
    }

    System.out.println("A matriz soma é:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(soma[i][j] + " ");
        }
        System.out.println();
    }

    scanner.close();
}
}