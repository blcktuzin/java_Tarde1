package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de horas Trabalhadas: ");

        int a = sc.nextInt();

        System.out.println("Digite o valor que você recebe por horas trabalhadas: ");

        double b = sc.nextDouble();

        System.out.println("Digite o valor da soma: ");

        double c = sc.nextDouble();

        double soma = b * c;

        System.out.println("NUMBER = " + a);

        System.out.printf("SALARY = U$%.2f%n", b * c);

        sc.close();
    }
}
