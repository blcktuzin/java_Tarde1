package Atv_17Mod;

import java.util.Scanner;

public class Exercicio29 {
    public static String avaliarLote(double defeitos) {
        if (defeitos > 20) {
            return "Reprovar lote";
        } else if (defeitos >= 10) {
            return "Enviar para retrabalho";
        } else {
            return "Aprovar lote";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o percentual de defeitos (%):");
        double defeitos = sc.nextDouble();

        String resultado = avaliarLote(defeitos);
        System.out.println(resultado);

        sc.close();
    }
}
