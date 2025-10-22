package Atv_17Mod;

import java.util.Scanner;

public class Exercicio30 {
    public static String verificarTemperatura(double temperatura) {
        if (temperatura > 80) {
            return "Desligar servidores";
        } else if (temperatura >= 60) {
            return "Ativar resfriamento extra";
        } else {
            return "Temperatura normal";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura do Data Center (°C):");
        double temperatura = sc.nextDouble();

        String resultado = verificarTemperatura(temperatura);
        System.out.println(resultado);

        sc.close();
    }
}
