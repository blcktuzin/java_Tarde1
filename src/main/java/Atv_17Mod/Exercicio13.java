package Atv_17Mod;

import java.util.Scanner;

public class Exercicio13 {
    public static String avaliarProducao(int producao) {
        if (producao < 50) {
            return "Desempenho baixo";
        } else if (producao <= 100) {
            return "Desempenho regular";
        } else {
            return "Desempenho ótimo";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de peças produzidas por hora:");
        int producao = sc.nextInt();

        String resultado = avaliarProducao(producao);
        System.out.println(resultado);

        sc.close();
    }
}
