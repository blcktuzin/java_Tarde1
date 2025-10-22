package Atv_17Mod;

import java.util.Scanner;

public class Exercicio11 {
    public static String verificarBateria(int bateria) {
        if (bateria < 20) {
            return "Retorno imediato";
        } else if (bateria <= 60) {
            return "Rota curta";
        } else {
            return "Rota longa";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível de bateria do drone (%):");
        int bateria = sc.nextInt();

        // Chamando a função modularizada
        String resultado = verificarBateria(bateria);
        System.out.println(resultado);

        sc.close();
    }
}
