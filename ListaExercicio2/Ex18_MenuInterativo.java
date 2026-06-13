package ListaExercicio2;

import java.util.Scanner;

public class MenuInterativo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // O loop rodará para sempre até encontrar o comando 'break'
        while (true) {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = sc.nextInt();

            // Verificação de saída imediata
            if (opcao == 3) {
                System.out.println("Saindo do sistema... Até logo!");
                break; // Aqui o loop é interrompido e o programa encerra
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double s1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double s2 = sc.nextDouble();
                    System.out.println("Resultado da Soma: " + (s1 + s2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double sub1 = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double sub2 = sc.nextDouble();
                    System.out.println("Resultado da Subtração: " + (sub1 - sub2));
                    break;

                default:
                    System.out.println("⚠️ Opção inválida! Tente novamente.");
                    break;
            }
        }

        sc.close();
    }
}