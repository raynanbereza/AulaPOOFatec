package ListaExercicio2;

import java.util.Scanner;

public class CaixaEletronico16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que deseja sacar: R$ ");
        int valor = sc.nextInt();

        // Variável auxiliar para não perder o valor original
        int restante = valor;

        // Cálculo das notas de 100
        int notas100 = restante / 100;
        restante %= 100; // O que sobra depois das notas de 100

        // Cálculo das notas de 50
        int notas50 = restante / 50;
        restante %= 50;

        // Cálculo das notas de 20
        int notas20 = restante / 20;
        restante %= 20;

        // Cálculo das notas de 10
        int notas10 = restante / 10;
        restante %= 10;

        // Cálculo das notas de 5
        int notas5 = restante / 5;
        restante %= 5;

        // Cálculo das notas de 2
        int notas2 = restante / 2;
        restante %= 2;

        // O que sobrar depois de tudo são as notas (ou moedas) de 1
        int notas1 = restante;

        System.out.println("\nQuantidade mínima de notas para R$ " + valor + ":");
        if (notas100 > 0) System.out.println("Notas de 100: " + notas100);
        if (notas50 > 0)  System.out.println("Notas de 50: " + notas50);
        if (notas20 > 0)  System.out.println("Notas de 20: " + notas20);
        if (notas10 > 0)  System.out.println("Notas de 10: " + notas10);
        if (notas5 > 0)   System.out.println("Notas de 5: " + notas5);
        if (notas2 > 0)   System.out.println("Notas de 2: " + notas2);
        if (notas1 > 0)   System.out.println("Notas de 1: " + notas1);

        sc.close();
    }
}