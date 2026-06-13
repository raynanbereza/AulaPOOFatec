import java.util.Scanner;

class BuscaVetorOcorrencia8 {      

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        int[] A = new int[10];
        System.out.println("Digite " + 10 + " Valores:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Digite o valor a ser buscado:");
        int valorBuscado = scanner.nextInt();
        int contagem = 0;
        for (int i = 0; i < 10; i++) {
            if (A[i] == valorBuscado) {
                contagem++;
            }
        }
        System.out.println("O valor " + valorBuscado + " aparece " + contagem + " vezes no vetor.");

        scanner.close();
    }
}