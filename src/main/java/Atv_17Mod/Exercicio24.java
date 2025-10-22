package Atv_17Mod;

import java.util.Scanner;

public class Exercicio24 {
    public static String classificarTrafego(int trafego) {
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

        String resultado = classificarTrafego(trafego);
        System.out.println(resultado);

        sc.close();
    }
}
