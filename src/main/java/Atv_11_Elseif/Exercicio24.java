package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de unidades em estoque:");
        int quantidade = sc.nextInt();

        if (quantidade < 10) {
            System.out.println("Reabastecer urgente");
        } else if (quantidade <= 30) {
            System.out.println("Alerta de estoque");
        } else {
            System.out.println("Estoque normal");
        }

        sc.close();
    }
}
