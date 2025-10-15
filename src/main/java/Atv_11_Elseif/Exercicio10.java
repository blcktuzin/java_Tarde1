package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura do dispositivo (°C):");
        double temperatura = sc.nextDouble();

        if (temperatura < 0) {
            System.out.println("Alerta congelamento");
        } else if (temperatura <= 40) {
            System.out.println("Temperatura normal");
        } else {
            System.out.println("Alerta superaquecimento");
        }

        sc.close();
    }
}
