package Atv_17Mod;

import java.util.Scanner;

public class Exercicio15 {
    public static String verificarMaquina(double temperatura, double vibracao) {
        if (temperatura > 90 || vibracao > 80) {
            return "Desligar máquina em emergência";
        } else {
            return "Máquina funcionando normalmente";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura da máquina (°C):");
        double temperatura = sc.nextDouble();

        System.out.println("Digite o nível de vibração da máquina (%):");
        double vibracao = sc.nextDouble();

        String resultado = verificarMaquina(temperatura, vibracao);
        System.out.println(resultado);

        sc.close();
    }
}
