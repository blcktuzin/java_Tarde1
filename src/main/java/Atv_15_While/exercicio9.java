package Atv_15_While;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double consumoHora = 1000;   // consumo inicial em watts/hora
        double totalConsumido = 0;   // acumulador do consumo total
        int hora = 0;                // contador de horas

        // enquanto não completar 5 horas
        while (hora < 5) {
            hora++;
            System.out.println("Hora " + hora + ": consumo = " + consumoHora + " watts");

            totalConsumido += consumoHora;   // soma o consumo da hora atual
            consumoHora *= 1.10;             // aumenta 10% para a próxima hora
        }

        System.out.println("\nConsumo total após " + hora + " horas = " + totalConsumido + " watts.");

    }
}
