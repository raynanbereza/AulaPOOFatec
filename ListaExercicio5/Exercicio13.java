public class Exercicio13 {

    static int vida;

    public static void main(String[] args) {

        criarPersonagem();

        atacar();
        receberDano(20);
        curar(10);

        mostrarStatus();
    }

    public static void criarPersonagem() {
        vida = 100;
    }

    public static void mostrarStatus() {
        System.out.println("Vida: " + vida);
    }

    public static void atacar() {
        System.out.println("Ataque realizado!");
    }

    public static void receberDano(int dano) {
        vida -= dano;
    }

    public static void curar(int cura) {
        vida += cura;
    }
}