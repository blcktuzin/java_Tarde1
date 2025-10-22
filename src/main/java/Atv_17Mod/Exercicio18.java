package Atv_17Mod;

import java.util.Scanner;

public class Exercicio18 {
    public static String verificarEnergia(int energiaSolar) {
        if (energiaSolar > 70) {
            return "Usar energia solar";
        } else if (energiaSolar >= 30) {
            return "Usar modo híbrido";
        } else {
            return "Usar rede elétrica";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a porcentagem de energia solar disponível (%):");
        int energiaSolar = sc.nextInt();

        String resultado = verificarEnergia(energiaSolar);
        System.out.println(resultado);

        sc.close();
    }
}
