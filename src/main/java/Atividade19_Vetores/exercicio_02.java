package Atividade19_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int n = sc.nextInt();
        System.out.println("Números: ");
        int [] intero = new int[n];
        for (int i = 0; i < n; i++) {
            intero[i] = sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += intero[i];
        }
        int s = soma;
        System.out.println("A soma dos números é: " + soma);
        sc.close();
    }
}
