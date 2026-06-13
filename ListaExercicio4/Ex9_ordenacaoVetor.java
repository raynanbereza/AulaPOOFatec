import java.util.Scanner;

class ordenacaoVetor9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        int[] A = new int[10];
        System.out.println("Digite " + 10 + " Valores:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        // Ordenando o vetor
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        // Imprimindo o vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}