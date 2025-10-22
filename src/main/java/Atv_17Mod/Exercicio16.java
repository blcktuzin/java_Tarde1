package Atv_17Mod;

import java.util.Scanner;

public class Exercicio16 {
    public static String verificarDefeito(String nivel) {
        if (nivel.equalsIgnoreCase("alto")) {
            return "Defeito visível";
        } else if (nivel.equalsIgnoreCase("médio")) {
            return "Defeito microscópico";
        } else if (nivel.equalsIgnoreCase("baixo")) {
            return "Defeito ausente";
        } else {
            return "Nível inválido";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível do defeito na peça (alto, médio, baixo):");
        String nivel = sc.next();

        String resultado = verificarDefeito(nivel);
        System.out.println(resultado);

        sc.close();
    }
}
