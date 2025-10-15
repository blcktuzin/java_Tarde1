package Atv_15_While;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int falhasConsecutivas = 0; // contador de falhas seguidas
        int leitura = 0;            // número da leitura

        // enquanto o número de falhas consecutivas for menor que 5
        while (falhasConsecutivas < 5) {
            leitura++;

            // simula uma leitura do sensor (80% chance de sucesso, 20% de falha)
            boolean falha = sc.nextInt(100) < 20;

            if (falha) {
                falhasConsecutivas++;
                System.out.println("Leitura " + leitura + ": FALHA detectada (" + falhasConsecutivas + " consecutiva)");
            } else {
                System.out.println("Leitura " + leitura + ": Sensor funcionando normalmente.");
                falhasConsecutivas = 0; // zera o contador se leitura for bem-sucedida
            }
        }

        System.out.println("\n⚠️  Alerta: 5 falhas consecutivas detectadas!");
        System.out.println("Sistema desligado por segurança.");
    }
}
