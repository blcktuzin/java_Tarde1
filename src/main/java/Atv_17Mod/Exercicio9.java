package Atv_17Mod;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        verificarDefeitos(sc);
        sc.close();
    }

    public static void verificarDefeitos(Scanner sc) {
        System.out.println("Digite o índice de defeitos do lote (%):");
        double defeitos = sc.nextDouble();

        if (defeitos > 10) {
            System.out.println("Alerta: índice de defeitos alto!");
        } else {
            System.out.println("Lote aprovado");
        }
    }
}
