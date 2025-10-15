package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível do usuário (operador, supervisor, engenheiro):");
        String usuario = sc.next();

        if (usuario.equalsIgnoreCase("operador")) {
            System.out.println("Acesso restrito");
        } else if (usuario.equalsIgnoreCase("supervisor")) {
            System.out.println("Acesso parcial");
        } else if (usuario.equalsIgnoreCase("engenheiro")) {
            System.out.println("Acesso total");
        } else {
            System.out.println("Nível desconhecido");
        }

        sc.close();
    }
}
