package Atv_18Mod;

import java.util.Scanner;

public class moeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor e a moeda de origem (ex: 100,BRL): ");
        String entrada = sc.nextLine();

        String[] dados = entrada.split(",");
        if (dados.length != 2) {
            System.out.println("Entrada inválida!");
            sc.close();
            return;
        }

        double valor;
        try {
            valor = Double.parseDouble(dados[0]);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido!");
            sc.close();
            return;
        }

        String moedaOrigem = dados[1].toUpperCase();
        System.out.print("Digite a moeda de destino (USD ou EUR): ");
        String moedaDestino = sc.nextLine().toUpperCase();

        double valorConvertido = 0;
        boolean conversaoValida = true;

        if (moedaOrigem.equals("BRL") && moedaDestino.equals("USD")) {
            valorConvertido = valor / 5.0;
        } else if (moedaOrigem.equals("BRL") && moedaDestino.equals("EUR")) {
            valorConvertido = valor / 6.0;
        } else if (moedaOrigem.equals("USD") && moedaDestino.equals("BRL")) {
            valorConvertido = valor * 5.0;
        } else if (moedaOrigem.equals("EUR") && moedaDestino.equals("BRL")) {
            valorConvertido = valor * 6.0;
        } else {
            conversaoValida = false;
        }

        if (conversaoValida) {
            System.out.println("Valor convertido: " + valorConvertido + " " + moedaDestino);
        } else {
            System.out.println("Conversão não suportada!");
        }

        sc.close();
    }
}
