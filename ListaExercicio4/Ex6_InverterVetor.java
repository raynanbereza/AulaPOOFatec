import java.util.Scanner;

class InverterVetor6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        int[] A = new int[5];
        System.out.println("Digite " + 5 + " Valores:");
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }
        // Invertendo o vetor
        for (int i = 0; i < 5; i++) {
            int temp = A[i];
            A[i] = A[4 - i];
            A[4 - i] = temp;
        }
        System.out.println("O vetor invertido é:");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}