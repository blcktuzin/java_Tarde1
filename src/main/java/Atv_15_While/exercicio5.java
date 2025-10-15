package Atv_15_While;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pressao = 0; // pressão inicial

        // enquanto a pressão for menor que 120 psi
        while (pressao < 120) {
            System.out.print("Digite o valor da pressão (em psi): ");
            pressao = sc.nextDouble();

            if (pressao < 120) {
                System.out.println("Pressão dentro do limite. Monitorando...");
            } else {
                System.out.println("\n⚠️ Atenção! Pressão limite atingida: " + pressao + " psi.");
                System.out.println("Sistema interrompido para segurança.");
            }
        }
    }
}