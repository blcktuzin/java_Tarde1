package Atv_17Mod;

import java.util.Scanner;

public class Exercicio10 {

    public static String verificarTemperatura(double temperatura) {
        if (temperatura < 0) {
            return "Alerta congelamento";
        } else if (temperatura <= 40) {
            return "Temperatura normal";
        } else {
            return "Alerta superaquecimento";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura do dispositivo (°C):");
        double temperatura = sc.nextDouble();

        String resultado = verificarTemperatura(temperatura);
        System.out.println(resultado);

        sc.close();
    }
}
