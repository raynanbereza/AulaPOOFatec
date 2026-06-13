import java.util.Scanner;

public class Exercicio4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double n1 = lerNota();
        double n2 = lerNota();
        double n3 = lerNota();

        double media = calcularMedia(n1, n2, n3);

        String situacao = verificarSituacao(media);

        mostrarResultado(media, situacao);
    }

    public static double lerNota() {
        System.out.print("Digite uma nota: ");
        return sc.nextDouble();
    }

    public static double calcularMedia(double n1,
                                       double n2,
                                       double n3) {

        return (n1 + n2 + n3) / 3;
    }

    public static String verificarSituacao(double media) {

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        }

        return "Reprovado";
    }

    public static void mostrarResultado(double media,
                                        String situacao) {

        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}