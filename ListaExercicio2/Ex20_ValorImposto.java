package ListaExercicio2;

import java.util.Scanner;

public class ValorImposto20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Calculo de imposto de Renda\n Digite o valor do seu salário: ");
        double sal = sc.nextDouble();
        
        if (sal <= 2000) {
            System.out.println("valor a recolher: R$ 0,00(Alíquota Isenta)");
        } else if (sal > 2000 && sal <= 5000) {
            System.out.println("valor a recolher: R$ " + (sal * 0.1) + "(Alíquota de 10%)");
        } else {
            System.out.println("valor a recolher: R$ " + (sal * 0.2) + "(Alíquota de 20%)");
        }
        
        sc.close();
    }
}