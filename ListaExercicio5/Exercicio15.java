import java.util.Scanner;

public class Exercicio15 {

    static Scanner sc = new Scanner(System.in);
    static int pontos;

    public static void main(String[] args) {

        iniciarJogo();

        criarJogador();

        executarTurno();

        verificarVitoria();

        encerrarJogo();
    }

    public static void iniciarJogo() {
        System.out.println("QUIZ JAVA");
    }

    public static void criarJogador() {
        System.out.print("Nome: ");
        sc.nextLine();
    }

    public static void executarTurno() {

        System.out.println(
                "Java foi criado pela Sun?");

        String resp = sc.next();

        if (resp.equalsIgnoreCase("sim"))
            pontos++;
    }

    public static void verificarVitoria() {

        if (pontos > 0)
            System.out.println("Acertou!");
        else
            System.out.println("Errou!");
    }

    public static void encerrarJogo() {

        System.out.println(
                "Pontuação: " + pontos);
    }
}