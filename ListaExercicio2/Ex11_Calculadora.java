package ListaExercicio2;

import java.util.Scanner;

public class Calculadora11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Número 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Operação (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        switch (op) {
            case '+': System.out.println("Resultado: " + (n1 + n2)); break;
            case '-': System.out.println("Resultado: " + (n1 - n2)); break;
            case '*': System.out.println("Resultado: " + (n1 * n2)); break;
            case '/': 
                if (n2 != 0) System.out.println("Resultado: " + (n1 / n2));
                else System.out.println("Erro: Divisão por zero!");
                break;
            default: System.out.println("Operação inválida.");
        }
        sc.close();
    }
}