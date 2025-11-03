package Atv_18Mod;

import java.util.Scanner;

public class validador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha;
        boolean senhaValida = false;

        while (!senhaValida) {
            System.out.print("Digite sua senha: ");
            senha = sc.nextLine();

            if (validarSenha(senha)) {
                System.out.println("Senha válida!");
                senhaValida = true;
            } else {
                System.out.println("Senha inválida!");
                System.out.println("A senha deve ter pelo menos 8 caracteres, uma letra maiúscula e um número.\n");
            }
        }

        sc.close();
    }

    public static boolean validarSenha(String senha) {
        boolean temMaiuscula = false;
        boolean temNumero = false;

        if (senha.length() < 8) {
            return false;
        }

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            if (Character.isDigit(c)) {
                temNumero = true;
            }
        }

        return temMaiuscula && temNumero;
    }
}

