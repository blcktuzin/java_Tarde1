package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do pH:");
        double ph = sc.nextDouble();

        if (ph < 7) {
            System.out.println("Ácido");
        } else if (ph == 7) {
            System.out.println("Neutro");
        } else {
            System.out.println("Básico");
        }

        sc.close();
    }
}
