package Atv_18Mod;

import java.util.Scanner;

public class calculoJuros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double capital, taxa, valorFinal;
        int meses;

        System.out.print("Digite o valor do capital inicial: ");
        capital = sc.nextDouble();

        if (capital <= 0) {
            System.out.println("Valor inválido! O capital deve ser maior que zero.");
            sc.close();
            return;
        }

        System.out.print("Digite a taxa de juros mensal (em %): ");
        taxa = sc.nextDouble() / 100;

        System.out.print("Digite o número de meses: ");
        meses = sc.nextInt();

        if (meses <= 0) {
            System.out.println("Período inválido! O número de meses deve ser maior que zero.");
            sc.close();
            return;
        }

        int contador = 0;
        valorFinal = capital;

        while (contador < meses) {
            valorFinal = valorFinal + (valorFinal * taxa);
            contador++;
        }

        System.out.println("O valor final do investimento é: " + valorFinal);

        sc.close();
    }

}
