package Atv_18Mod;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else if (idade <= 12) {
            System.out.println("Classificação: Infantil");
        } else if (idade <= 17) {
            System.out.println("Classificação: Adolescente");
        } else if (idade <= 59) {
            System.out.println("Classificação: Adulto");
        } else {
            System.out.println("Classificação: Idoso");
        }

        sc.close();
    }
}


