package Atv_17Mod;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        verificarPermissao(sc);
        sc.close();
    }

    public static void verificarPermissao(Scanner sc) {
        System.out.println("Digite o cargo (operador, supervisor, engenheiro):");
        String cargo = sc.next().toLowerCase();

        if (cargo.equals("operador")) {
            System.out.println("Acesso restrito");
        } else if (cargo.equals("supervisor")) {
            System.out.println("Acesso parcial");
        } else if (cargo.equals("engenheiro")) {
            System.out.println("Acesso total");
        } else {
            System.out.println("Cargo inválido");
        }
    }
}
