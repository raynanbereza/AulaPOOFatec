import java.util.Scanner;
import java.util.Random;

public class Exercicio11 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int secreto = sortearNumero();
        int palpite;

        do {

            palpite = lerPalpite();

            if (!verificarAcerto(
                    palpite,
                    secreto)) {

                mostrarDica(
                        palpite,
                        secreto);
            }

        } while (!verificarAcerto(
                palpite,
                secreto));

        mostrarVitoria();
    }

    public static int sortearNumero() {
        return new Random().nextInt(100) + 1;
    }

    public static int lerPalpite() {

        System.out.print("Palpite: ");
        return sc.nextInt();
    }

    public static boolean verificarAcerto(
            int palpite,
            int secreto) {

        return palpite == secreto;
    }

    public static void mostrarDica(
            int palpite,
            int secreto) {

        if (palpite < secreto)
            System.out.println("Maior");

        else
            System.out.println("Menor");
    }

    public static void mostrarVitoria() {

        System.out.println("Você venceu!");
    }
}