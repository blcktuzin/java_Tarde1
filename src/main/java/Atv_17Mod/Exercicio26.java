package Atv_17Mod;

import java.util.Scanner;

public class Exercicio26 {
    public static String verificarTinta(int tinta) {
        if (tinta < 15) {
            return "Parar";
        } else if (tinta <= 50) {
            return "Alerta: pouca tinta";
        } else {
            return "Continuar pintura";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de tinta restante (%):");
        int tinta = sc.nextInt();

        String resultado = verificarTinta(tinta);
        System.out.println(resultado);

        sc.close();
    }
}







