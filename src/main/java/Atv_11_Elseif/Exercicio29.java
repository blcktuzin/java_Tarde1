package Atv_11_Elseif;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o percentual de defeitos (%):");
        double defeitos = sc.nextDouble();

        if (defeitos > 20) {
            System.out.println("Reprovar lote");
        } else if (defeitos >= 10) {
            System.out.println("Enviar para retrabalho");
        } else {
            System.out.println("Aprovar lote");
        }

        sc.close();
    }
}
