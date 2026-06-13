package ListaExercicio2;

import java.util.Scanner;

public class CalculoIMC15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (cm): ");
        double altura = sc.nextDouble();
        
        double imc = peso / ((altura/100) * (altura/100));
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        if (imc < 18.5) System.out.println("Abaixo do peso");
        else if (imc < 25) System.out.println("Normal");
        else if (imc < 30) System.out.println("Sobrepeso");
        else System.out.println("Obesidade");
        
        sc.close();
    }
}