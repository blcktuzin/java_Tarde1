package _01_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("DIGITE O PRIMEIRO NUMERO: ");
        double x = sc.nextDouble();
        System.out.println("DIGITE O SEGUNDO NUMERO: ");
        double y = sc.nextDouble();
        double soma = x + y;
        System.out.println("SOMA= " + soma);
    }
}
