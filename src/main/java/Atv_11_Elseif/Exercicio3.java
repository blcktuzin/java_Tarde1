package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a porcentagem de energia da máquina:");
        int energia = sc.nextInt();

        if (energia < 30) {
            System.out.println("Modo econômico");
        } else if (energia <= 70) {
            System.out.println("Modo normal");
        } else {
            System.out.println("Modo turbo");
        }

        sc.close();


    }

}
