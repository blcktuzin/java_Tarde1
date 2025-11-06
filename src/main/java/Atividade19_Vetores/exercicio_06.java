package Atividade19_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Qual número vc quer saber da lista ?");
        int n1 = sc.nextInt();
        boolean verfic = false;
        for (int i = 0; i < 10; i++) {
            if (n1 == numeros[i]) {
                verfic = true;
                break;
            }
        }
        if (verfic == true) {
            System.out.println("Número encontrado");
        } else {
            System.out.println("Número não encontrado");
            sc.close();
        }
    }
}
