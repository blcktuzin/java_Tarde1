package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estrada bloqueada? (true/false):");
        boolean bloqueada = sc.nextBoolean();

        System.out.println("Trânsito alto? (true/false):");
        boolean transitoAlto = sc.nextBoolean();

        if (bloqueada) {
            System.out.println("Recalcular rota");
        } else if (transitoAlto) {
            System.out.println("Rota alternativa");
        } else {
            System.out.println("Seguir normal");
        }

        sc.close();
    }
}
