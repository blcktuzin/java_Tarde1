package Atv_17Mod;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        verificarDistancia(sc);
        sc.close();
    }

    public static void verificarDistancia(Scanner sc) {
        System.out.println("Digite a distância do obstáculo (em metros):");
        double distancia = sc.nextDouble();

        if (distancia < 5) {
            System.out.println("Ação: frear imediatamente");
        } else if (distancia <= 15) {
            System.out.println("Ação: reduzir velocidade");
        } else {
            System.out.println("Ação: acelerar");
        }
    }
}
