import java.util.Scanner;

class leituraArraySimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = {1,2,3,4};        
      
        for (int i = 0; i < 4; i++) {
           System.out.print(a[i]+" ");
        }
        scanner.close();
    }
}