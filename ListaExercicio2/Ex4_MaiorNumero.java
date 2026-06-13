package ListaExercicio2;

import java.util.Scanner;

public class MaiorNumero4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1+ " é maior que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2+ " é maior que " + num1);
        } else {
            System.out.println("Os números são iguais.");
        }
        
        sc.close();
    }
}