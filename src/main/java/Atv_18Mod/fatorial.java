package Atv_18Mod;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        int fatorial = 1;

        while (i <= n) {
            fatorial = fatorial * i;
            i++;
        }
        System.out.println("O fatorial de " + n + " é " + fatorial);
        sc.close();
    }
}
