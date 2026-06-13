    import java.util.Scanner;

class Ex12_SomaMatriz3x3{
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    int[][] A = new int[3][3];
    System.out.println("Digite os valores para a matriz 3x3:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            A[i][j] = scanner.nextInt();
        }
    }
    int soma = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            soma += A[i][j];
        }
    }
    System.out.println("A soma dos elementos da matriz é: " + soma);

    scanner.close();
}
}

