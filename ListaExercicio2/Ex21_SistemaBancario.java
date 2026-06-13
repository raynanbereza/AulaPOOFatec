package ListaExercicio2;

import java.util.Scanner;

public class SistemaBancario21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Configurações de Login
        String usuarioCadastrado = "admin";
        String senhaCadastrada = "1234";
        boolean logado = false;
        
        // Dados da Conta
        double saldo = 1000.0;

        // --- MÓDULO DE SEGURANÇA (LOGIN) ---
        System.out.println("=== SISTEMA BANCÁRIO - ACESSO ===");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Usuário: ");
            String user = sc.next();
            System.out.print("Senha: ");
            String pass = sc.next();

            if (user.equals(usuarioCadastrado) && pass.equals(senhaCadastrada)) {
                logado = true;
                break;
            } else {
                System.out.println(" Acesso Negado! Tentativa " + i + " de 3.\n");
            }
        }

        // --- MÓDULO OPERACIONAL (MENU) ---
        if (logado) {
            System.out.println("\n Login realizado com sucesso!");
            
            while (true) {
                System.out.println("\n--- MENU PRINCIPAL ---");
                System.out.println("1 - Ver Saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = sc.nextInt();

                if (opcao == 4) {
                    System.out.println("Encerrando sessão... Obrigado por utilizar nosso banco!");
                    break;
                }

                switch (opcao) {
                    case 1:
                        System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                        break;

                    case 2:
                        System.out.print("Valor do depósito: R$ ");
                        double deposito = sc.nextDouble();
                        if (deposito > 0) {
                            saldo += deposito;
                            System.out.println("Depósito de R$ " + deposito + " realizado!");
                        } else {
                            System.out.println("Valor inválido para depósito.");
                        }
                        break;

                    case 3:
                        System.out.print("Valor do saque: R$ ");
                        double saque = sc.nextDouble();
                        
                        // REGRA: Não permitir saque sem saldo suficiente
                        if (saque > saldo) {
                            System.out.println("Erro: Saldo insuficiente! Seu saldo é de R$ " + saldo);
                        } else if (saque <= 0) {
                            System.out.println("Valor de saque inválido.");
                        } else {
                            saldo -= saque;
                            System.out.println("Saque de R$ " + saque + " realizado com sucesso!");
                        }
                        break;

                    default:
                        System.out.println(" Opção inválida.");
                }
            }
        } else {
            System.out.println("CONTA BLOQUEADA: Procure sua agência.");
        }

        sc.close();
    }
}