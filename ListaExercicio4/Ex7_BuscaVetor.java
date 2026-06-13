import java.util.Scanner;

class BuscaVetor7 {      

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        int[] A = new int[10];
        System.out.println("Digite " + 10 + " Valores:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Digite o valor a ser buscado:");
        int valorBuscado = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (A[i] == valorBuscado) {
                System.out.println("O valor " + valorBuscado + " foi encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O valor " + valorBuscado + " não foi encontrado no vetor.");
        }

        scanner.close();
    }
}