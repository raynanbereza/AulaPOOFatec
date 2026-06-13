import java.util.Scanner;

class LeituraMatriz3x3{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        int[] A = new int[4];
        int contagem = 0;
        System.out.println("Digite " + 4 + " Valores:");
        for (int i = 0; i < 4; i++) {
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            if (A[i] % 2 == 0) {
                contagem++;
          
            }
        }
        System.out.println("A contagem dos elementos pares do vetor é: " + contagem);

        scanner.close();
    }
}