package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas de uso da máquina:");
        int horas = sc.nextInt();

        if (horas < 500) {
            System.out.println("Urgência baixa");
        } else if (horas <= 1000) {
            System.out.println("Urgência média");
        } else {
            System.out.println("Urgência alta");
        }

        sc.close();
    }
}
