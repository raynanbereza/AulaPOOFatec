import java.util.Scanner;

public class Exercicio8 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String nome = lerNome();
        int idade = lerIdade();
        String cidade = lerCidade();

        mostrarResumo(nome, idade, cidade);
    }

    public static String lerNome() {

        System.out.print("Nome: ");
        return sc.nextLine();
    }

    public static int lerIdade() {

        System.out.print("Idade: ");
        return sc.nextInt();
    }

    public static String lerCidade() {

        sc.nextLine();

        System.out.print("Cidade: ");
        return sc.nextLine();
    }

    public static void mostrarResumo(String nome,
                                     int idade,
                                     String cidade) {

        System.out.println("\nResumo:");
        System.out.println(nome);
        System.out.println(idade + " anos");
        System.out.println(cidade);
    }
}