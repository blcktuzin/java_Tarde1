package Atv_17Mod;

import java.util.Scanner;

public class Exercicio14 {
    public static String avaliarVelocidade(int itens) {
        if (itens < 10) {
            return "Velocidade lenta";
        } else if (itens <= 30) {
            return "Velocidade média";
        } else {
            return "Velocidade rápida";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de itens detectados na esteira:");
        int itens = sc.nextInt();

        String resultado = avaliarVelocidade(itens);
        System.out.println(resultado);

        sc.close();
    }
}
