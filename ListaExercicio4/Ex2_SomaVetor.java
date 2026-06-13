import java.util.Scanner;

class SomaVetor{
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    int[] A = new int[10];
    System.out.println("Digite " + 10 + " Valores:");
    for (int i = 0; i < 10; i++) {
        A[i] = scanner.nextInt();
    }
    int soma = 0;
    for (int i = 0; i < 10; i++) {
        soma += A[i];
    }
    System.out.println("A soma dos elementos do vetor é: " + soma);

    scanner.close();
}
}