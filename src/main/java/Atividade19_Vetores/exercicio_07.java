package Atividade19_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] numeors = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeors[i] = sc.nextInt();
        }

        System.out.print("Vetor preenchido: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeors[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}
