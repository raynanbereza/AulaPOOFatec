package ListaExercicio2;

import java.util.Scanner;

public class ClassificaTriangulo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite os três lados do triângulo: ");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
        
        sc.close();
    }
}