import java.util.Scanner;

class MaiorMenorValor{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        int[] A = new int[8];
        System.out.println("Digite " + 8 + " Valores:");
        for (int i = 0; i < 8; i++) {
            A[i] = scanner.nextInt();
        }
        int maior = A[0];
        int menor = A[0];
        for (int i = 1; i < 8; i++) {
            if (A[i] > maior) {
                maior = A[i];
            }
            if (A[i] < menor) {
                menor = A[i];
            }
        }
        System.out.println("O maior valor do vetor é: " + maior);
        System.out.println("O menor valor do vetor é: " + menor);

        scanner.close();
    }
}