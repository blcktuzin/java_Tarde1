package Atividade19_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[6];
        double  maior = 0, menor = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite os números " + (i + 1) + " :");
            numeros[i] = sc.nextDouble();
            if (numeros[i] == 0) {
                maior = numeros[i];
                menor = numeros[i];
            } else {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                } if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }
        }
        System.out.println("O numero maior é: "+ maior + "\nO numero menor é: " +menor);
        sc.close();
    }
}
