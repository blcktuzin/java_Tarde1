package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        ArrayList<Double> temperaturas = lerTemperaturas();
        imprimirTemperaturas(temperaturas);
    }

    public static ArrayList<Double> lerTemperaturas() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite a temperatura do dia " + i + ": ");
            double temp = sc.nextDouble();
            lista.add(temp);
        }

        return lista;
    }

    public static void imprimirTemperaturas(ArrayList<Double> lista) {
        System.out.println("\n--- Temperaturas da Semana ---");
        for (double temp : lista) {
            if (temp >= 35) {
                System.out.println(temp + " °C - Alerta de calor");
            } else {
                System.out.println(temp + " °C");
            }
        }
    }
}