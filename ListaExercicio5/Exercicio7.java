public class Exercicio7 {

    public static void main(String[] args) {

        mostrarNumeros();
        mostrarPares();
        mostrarImpares();
    }

    public static void mostrarNumeros() {

        System.out.println("\nTODOS:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void mostrarPares() {

        System.out.println("\n\nPARES:");

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void mostrarImpares() {

        System.out.println("\n\nÍMPARES:");

        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}