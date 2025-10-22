package Atv_17Mod;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        verificarMaterial(sc);
        sc.close();
    }

    public static void verificarMaterial(Scanner sc) {
        System.out.println("Digite a quantidade restante de material (%):");
        double material = sc.nextDouble();

        if (material < 20) {
            System.out.println("Trocar material de impressão");
        } else {
            System.out.println("Material suficiente — continuar impressão");
        }
    }
}
