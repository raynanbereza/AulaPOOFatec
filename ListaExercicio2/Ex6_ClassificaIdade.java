package ListaExercicio2;

import java.util.Scanner;

public class ClassificaIdade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        
        if (num1 >= 0 && num1 <= 12) {
            System.out.println(num1+ " --> Criança.");
        } else if (num1 >= 13 && num1 <= 17) {
            System.out.println(num1+ " --> Adolescente.");
        } else if (num1 >= 18 && num1 <= 59) {
            System.out.println(num1+ " --> Adulto.");
        } else {
            System.out.println(num1+ " --> Idoso.");
        }
        
        sc.close();
    }
}