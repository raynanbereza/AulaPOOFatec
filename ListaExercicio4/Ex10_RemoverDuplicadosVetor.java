import java.util.Scanner;

class RemoverDuplicadosVetor10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        int[] A = new int[10];
        System.out.println("Digite " + 10 + " Valores:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        int[] B = new int[10];
        int j = 0;  
        for (int i = 0; i < 10; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (A[i] == B[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                B[j] = A[i];
                j++;
            }
        }
        System.out.println("Vetor sem duplicados:");
        for (int i = 0; i < j; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}