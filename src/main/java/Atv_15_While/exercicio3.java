package Atv_15_While;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = 0;                // contador de horas
        int producaoPorHora = 50;    // unidades produzidas por hora
        int producaoTotal = 0;       // soma total da produção

        // enquanto não completar 8 horas de trabalho
        while (hora < 8) {
            hora++; // incrementa a hora
            producaoTotal += producaoPorHora; // soma a produção da hora
            System.out.println("Hora " + hora + ": produção acumulada = " + producaoTotal + " unidades");
        }

        // exibe o total final
        System.out.println("\nProdução total após " + hora + " horas = " + producaoTotal + " unidades.");
    }
}
