package Atv_17Mod;

import java.util.Scanner;

public class Exercicio17 {

    public static String verificarRobo(boolean roboA, boolean roboB) {
        if (!roboA) {
            return "Robô A operando normalmente";
        } else if (!roboB) {
            return "Acionar Robô B";
        } else {
            return "Parar a linha de produção";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Robô A falhou? (true/false):");
        boolean roboA = sc.nextBoolean();

        System.out.println("Robô B falhou? (true/false):");
        boolean roboB = sc.nextBoolean();

        String resultado = verificarRobo(roboA, roboB);
        System.out.println(resultado);

        sc.close();
    }
}
