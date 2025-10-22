package Atv_17Mod;

import java.util.Scanner;

public class Exercicio22 {
    public static String classificarAr(int indice) {
        if (indice < 50) {
            return "Qualidade do ar: bom";
        } else if (indice <= 100) {
            return "Qualidade do ar: moderado";
        } else if (indice <= 200) {
            return "Qualidade do ar: ruim";
        } else {
            return "Qualidade do ar: crítico";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o índice de partículas no ar:");
        int indice = sc.nextInt();

        String resultado = classificarAr(indice);
        System.out.println(resultado);

        sc.close();
    }
}
