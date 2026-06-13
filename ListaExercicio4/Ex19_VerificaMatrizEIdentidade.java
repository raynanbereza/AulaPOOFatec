    import java.util.Scanner;

class Ex19_VerificaMatrizEIdentidade {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    int[][] A = new int[3][3];
    boolean Identidade = true;
    System.out.println("Digite os valores para a matriz 3x3:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            A[i][j] = scanner.nextInt();
        }
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(A[i][j] + " ");
        }
        System.out.println();
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if ((i == j && A[i][j] != 1) ||(i != j && A[i][j] != 0)) {
                Identidade = false;
                break;
            } 
            }
        }
       if(Identidade){
           System.out.print("A matriz é uma matriz identidade.");
       } else {
           System.out.print("A matriz não é uma matriz identidade.");
       }
    

    scanner.close();
}
}