package Atv_15_While;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPecas = 10000;  // total de peças a serem produzidas
        int falhas = 0;          // contador de falhas detectadas
        int pecasProduzidas = 0; // contador de peças produzidas

        // enquanto o total de falhas for menor que 50 e ainda houver peças sendo produzidas
        while (falhas < 50 && pecasProduzidas < totalPecas) {
            pecasProduzidas++;

            // simula a chance de falha (ex: 1% de chance de falhar)
            boolean houveFalha = sc.nextInt(100) < 1;

            if (houveFalha) {
                falhas++;
            }

            // a cada 500 peças, exibe o progresso
            if (pecasProduzidas % 500 == 0) {
                System.out.println("Peças produzidas: " + pecasProduzidas + " | Falhas detectadas: " + falhas);
            }
        }

        System.out.println("\nProdução encerrada!");
        System.out.println("Total de peças produzidas: " + pecasProduzidas);
        System.out.println("Total de falhas detectadas: " + falhas);


    }
}
