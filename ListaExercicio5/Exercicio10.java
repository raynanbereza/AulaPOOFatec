import java.util.Scanner;

public class Exercicio10 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String usuario = lerUsuario();
        String senha = lerSenha();

        boolean valido =
                validarLogin(usuario, senha);

        mostrarResultado(valido);
    }

    public static String lerUsuario() {

        System.out.print("Usuário: ");
        return sc.nextLine();
    }

    public static String lerSenha() {

        System.out.print("Senha: ");
        return sc.nextLine();
    }

    public static boolean validarLogin(
            String usuario,
            String senha) {

        return usuario.equals("admin")
                && senha.equals("123");
    }

    public static void mostrarResultado(
            boolean valido) {

        if (valido)
            System.out.println("Login OK");
        else
            System.out.println("Login inválido");
    }
}