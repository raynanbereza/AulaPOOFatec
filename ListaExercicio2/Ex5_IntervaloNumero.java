package ListaExercicio2;

import java.util.Scanner;

public class IntervaloNumero5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        
        if (num1 >= 10 && num1 <= 50) {
            System.out.println(num1+ " está dentro do intervalo de 10 a 50.");
        } else {
            System.out.println(num1+ " está fora do intervalo de 10 a 50.");
        }
        
        sc.close();
    }
}