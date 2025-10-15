package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE A AREA DO CIRCULO: ");
        double raio = sc.nextDouble();
        double area = 3.14159  *raio * raio;

        System.out.printf("A área do círculo é: %.4f%n", area);
    }
}
