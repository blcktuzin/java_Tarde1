package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de peças produzidas por hora:");
        int producao = sc.nextInt();

        if (producao < 50) {
            System.out.println("Desempenho baixo");
        } else if (producao <= 100) {
            System.out.println("Desempenho regular");
        } else {
            System.out.println("Desempenho ótimo");
        }

        sc.close();
    }
}
