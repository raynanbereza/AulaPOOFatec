package ListaExercicio2;

import java.util.Scanner;

public class LoginTentativas17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Dados cadastrados no sistema
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";
        
        boolean acessoGarantido = false;

        System.out.println("--- SISTEMA DE LOGIN ---");

        // O laço vai de 1 até 3
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.print("\nTentativa " + tentativa + " de 3");
            System.out.print("\nUsuário: ");
            String user = sc.next();
            System.out.print("Senha: ");
            String pass = sc.next();

            // Validação
            if (user.equals(usuarioCorreto) && pass.equals(senhaCorreta)) {
                System.out.println("\n Login realizado com sucesso! Bem-vindo.");
                acessoGarantido = true;
                break; // Interrompe o laço se acertar, não precisa das outras tentativas
            } else {
                if (tentativa < 3) {
                    System.out.println(" Usuário ou senha incorretos. Tente novamente.");
                }
            }
        }

        // Se o loop terminar e não houve sucesso, bloqueia
        if (!acessoGarantido) {
            System.out.println("\n🚫 Erro: Você errou 3 vezes. CONTA BLOQUEADA!");
        }

        sc.close();
    }
}