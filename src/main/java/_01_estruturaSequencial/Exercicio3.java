package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO VALOR:");
        int a = sc.nextInt();
        System.out.println("DIGITE O SEGUNDO VALOR:");
        int b = sc.nextInt();
        System.out.println("DIGITE O TERCEIRO VALOR:");
        int c = sc.nextInt();
        System.out.println("DIGITE O QUARTO VALOR:");
        int d = sc.nextInt();
        int DIFERENCA = a * b - c * d;
        System.out.println("A DIFERENCA É: " + DIFERENCA);
        sc.close();
    }
}
