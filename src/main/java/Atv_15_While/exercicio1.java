package Atv_15_While;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pecas = 0; // contador de peças

        // enquanto o número de peças for menor que 100
        while (pecas < 100) {
            pecas++; // incrementa 1 peça
            System.out.println("Peças produzidas: " + pecas);
        }

        // quando chegar a 100 o loop para
        System.out.println("Produção concluída! Total de peças: " + pecas);
    }
}
