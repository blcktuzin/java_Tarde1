package Atividade19_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] palavras = new String[5];
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as palavras " + (i + 1) + " :");
            palavras[i] = sc.nextLine();
            if (palavras[i].length() >= 5) {
                contador++;
            }
        }
        System.out.println("O total de palavras que possui mais de 5 são: " + contador);
        sc.close();
    }
}
