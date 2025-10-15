package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o percentual de tráfego suspeito (%):");
        int trafego = sc.nextInt();

        if (trafego > 70) {
            System.out.println("Bloquear acesso");
        } else if (trafego >= 30) {
            System.out.println("Alerta");
        } else {
            System.out.println("Tráfego normal");
        }

        sc.close();
    }
}
