package Atv_15_While;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        int quantidadePecas = 10;   // total de peças a produzir
        int contador = 0;            // peças produzidas até o momento
        int tempoPorPeca = 60;       // tempo inicial (em segundos)
        int tempoTotal = 0;          // acumulador de tempo total

        // enquanto ainda houver peças a produzir
        while (contador < quantidadePecas) {
            contador++;
            tempoTotal += tempoPorPeca;

            System.out.println("Peça " + contador + " produzida em " + tempoPorPeca + " segundos.");

            // diminui o tempo em 10 segundos a cada ciclo, sem deixar ficar negativo
            tempoPorPeca -= 10;
            if (tempoPorPeca < 0) {
                tempoPorPeca = 0;
            }
        }

        System.out.println("\nTempo total de produção: " + tempoTotal + " segundos.");


    }
}
