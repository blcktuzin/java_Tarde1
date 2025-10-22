package Atv_17Mod;

import java.util.Scanner;

public class Exercicio7 {
    public class ArmazemAutomatizado {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            classificarPacote(sc);
            sc.close();
        }

        public static void classificarPacote(Scanner sc) {
            System.out.println("Digite o peso do pacote (em kg):");
            double peso = sc.nextDouble();

            if (peso < 10) {
                System.out.println("Pacote leve");
            } else if (peso <= 30) {
                System.out.println("Pacote médio");
            } else if (peso <= 60) {
                System.out.println("Pacote pesado");
            } else {
                System.out.println("Pacote muito pesado");
            }
        }
    }
}
