package Atv_15_While;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;          // número de leituras realizadas
        double somaTemperaturas = 0; // soma das temperaturas
        double temperatura;          // variável para armazenar a temperatura lida

        // repete até completar 24 leituras
        while (contador < 24) {
            System.out.print("Digite a temperatura da hora " + (contador + 1) + ": ");
            temperatura = sc.nextDouble();
            somaTemperaturas += temperatura;
            contador++;
        }

        // calcula a média
        double media = somaTemperaturas / 24;

        System.out.println("\nMédia de temperatura das 24 horas: " + media + "°C");

        sc.close();
    }
}