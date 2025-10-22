package Atv_17Mod;

import java.util.Scanner;

public class Exercicio12 {
    public static String verificarAcesso(boolean cracha, boolean capacete, boolean horario) {
        if (cracha && capacete && horario) {
            return "Acesso permitido";
        } else {
            return "Acesso negado";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crachá válido? (true/false):");
        boolean cracha = sc.nextBoolean();

        System.out.println("Capacete de segurança? (true/false):");
        boolean capacete = sc.nextBoolean();

        System.out.println("Dentro do horário de turno? (true/false):");
        boolean horario = sc.nextBoolean();

        // Chamando a função modularizada
        String resultado = verificarAcesso(cracha, capacete, horario);
        System.out.println(resultado);

        sc.close();
    }
}
