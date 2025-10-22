package Atv_17Mod;

import java.util.Scanner;

public class Exercicio27 {
    public static String verificarErro(String erro) {
        if (erro.equalsIgnoreCase("critico")) {
            return "Parar linha de produção";
        } else if (erro.equalsIgnoreCase("moderado")) {
            return "Acionar manutenção";
        } else if (erro.equalsIgnoreCase("nenhum")) {
            return "Continuar produção";
        } else {
            return "Tipo de erro inválido";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de erro (critico, moderado, nenhum):");
        String erro = sc.next();

        String resultado = verificarErro(erro);
        System.out.println(resultado);

        sc.close();
    }
}
