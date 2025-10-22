package Atv_17Mod;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        decidirMovimento(sc);
        sc.close();
    }

    public static void decidirMovimento(Scanner sc) {
        System.out.println("Sensor frontal (true/false): ");
        boolean frontal = sc.nextBoolean();

        System.out.println("Sensor direita (true/false): ");
        boolean direita = sc.nextBoolean();

        System.out.println("Sensor esquerda (true/false): ");
        boolean esquerda = sc.nextBoolean();

        if (!frontal) {
            System.out.println("Seguir em frente");
        } else if (!direita) {
            System.out.println("Desviar para a direita");
        } else if (!esquerda) {
            System.out.println("Desviar para a esquerda");
        } else {
            System.out.println("Parar — caminho bloqueado");
        }
    }
}