package Atv_17Mod;

import java.util.Scanner;

public class Exercicio21 {
    public static String verificarCarga(double carga) {
        if (carga < 500) {
            return "Carga permitida";
        } else if (carga <= 1000) {
            return "Alerta: carga alta";
        } else {
            return "Carga proibida";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso da carga do veículo (kg):");
        double carga = sc.nextDouble();

        String resultado = verificarCarga(carga);
        System.out.println(resultado);

        sc.close();
    }
}
