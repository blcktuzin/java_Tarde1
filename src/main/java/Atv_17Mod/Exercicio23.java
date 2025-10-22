package Atv_17Mod;

import java.util.Scanner;

public class Exercicio23 {
    public static String verificarTrafego(int trafego) {
        if (trafego > 70) {
            return "Bloquear acesso";
        } else if (trafego >= 30) {
            return "Alerta";
        } else {
            return "Tráfego normal";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o percentual de tráfego suspeito (%):");
        int trafego = sc.nextInt();

        String resultado = verificarTrafego(trafego);
        System.out.println(resultado);

        sc.close();
    }
}






