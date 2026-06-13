package ListaExercicio2;

import java.util.Scanner;

public class ClassificaNumero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
        
        sc.close();
    }
}