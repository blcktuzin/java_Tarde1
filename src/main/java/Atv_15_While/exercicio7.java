package Atv_15_While;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        int velocidade = 0;      // velocidade inicial da máquina (em RPM)
        int incremento = 200;    // aumento de velocidade a cada 2 minutos
        int tempo = 0;           // tempo total em minutos

        // enquanto a velocidade for menor que 1000 RPM
        while (velocidade < 1000) {
            tempo += 2;                  // passam-se 2 minutos
            velocidade += incremento;    // aumenta a velocidade

            // garante que não ultrapasse o limite máximo
            if (velocidade > 1000) {
                velocidade = 1000;
            }

            System.out.println("Após " + tempo + " minutos, velocidade = " + velocidade + " RPM");
        }

        System.out.println("\nVelocidade máxima de " + velocidade + " RPM atingida em " + tempo + " minutos.");

    }
}
