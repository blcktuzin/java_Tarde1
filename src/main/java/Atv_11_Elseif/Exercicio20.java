package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora atual (0–23):");
        int hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Turno da manhã");
        } else if (hora <= 18) {
            System.out.println("Turno da tarde");
        } else {
            System.out.println("Turno da noite");
        }

        sc.close();
    }
}
