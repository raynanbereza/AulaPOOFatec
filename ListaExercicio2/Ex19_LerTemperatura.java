package ListaExercicio2;

import java.util.Scanner;

public class LerTemperatura19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();
        
        if (num < 15) {
            System.out.println("Frio");
        } else if (num >= 15 && num <= 25) {
            System.out.println("Agradável");
        } else {
            System.out.println("Quente");
        }
        
        sc.close();
    }
}