package Atv_17Mod;

import java.util.Scanner;

public class Exercicio25 {
    public static String classificarIntensidade(int intensidade) {
        if (intensidade < 100) {
            return "Intensidade fraca";
        } else if (intensidade <= 200) {
            return "Intensidade média";
        } else {
            return "Intensidade forte";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a intensidade elétrica (A):");
        int intensidade = sc.nextInt();

        String resultado = classificarIntensidade(intensidade);
        System.out.println(resultado);

        sc.close();
    }
}
