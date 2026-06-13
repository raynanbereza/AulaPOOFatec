import java.util.Scanner;

class MediaVetor4{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        int[] A = new int[6];
        System.out.println("Digite " + 6 + " Valores:");
        for (int i = 0; i < 6; i++) {
            A[i] = scanner.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < 6; i++) {
            soma += A[i];
        }
        double media = (double) soma / 6;
        System.out.println("A média dos elementos do vetor é: " + media);

        scanner.close();
    }
}