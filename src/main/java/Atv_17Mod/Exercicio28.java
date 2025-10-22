package Atv_17Mod;

import java.util.Scanner;

public class Exercicio28 {
    public static String verificarRota(boolean bloqueada, boolean transitoAlto) {
        if (bloqueada) {
            return "Recalcular rota";
        } else if (transitoAlto) {
            return "Rota alternativa";
        } else {
            return "Seguir normal";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estrada bloqueada? (true/false):");
        boolean bloqueada = sc.nextBoolean();

        System.out.println("Trânsito alto? (true/false):");
        boolean transitoAlto = sc.nextBoolean();

        String resultado = verificarRota(bloqueada, transitoAlto);
        System.out.println(resultado);

        sc.close();
    }
}
