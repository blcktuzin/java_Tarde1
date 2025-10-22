package Atv_17Mod;

import java.util.Scanner;

public class Exercicio20 {
    public static String classificarPH(double ph) {
        if (ph < 7) {
            return "Ácido";
        } else if (ph == 7) {
            return "Neutro";
        } else {
            return "Básico";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do pH:");
        double ph = sc.nextDouble();

        String resultado = classificarPH(ph);
        System.out.println(resultado);

        sc.close();
    }
}
