package ListaExercicio2;
import java.util.Scanner;

public class ClassificaMaioridade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int num = sc.nextInt();
        
        if (num >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        } 
        
        sc.close();
    }
}