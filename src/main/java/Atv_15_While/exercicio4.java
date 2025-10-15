package Atv_15_While;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estoque = 500;  // estoque inicial

        // enquanto o estoque for igual ou maior que 100 unidades
        while (estoque >= 100) {
            System.out.println("Estoque atual: " + estoque + " unidades");
            estoque -= 20; // reduz 20 unidades
        }

        // quando o estoque for menor que 100, o loop para
        System.out.println("\nEstoque baixo! Restam apenas " + estoque + " unidades.");
        System.out.println("Necessário reabastecimento.");
    }
}
