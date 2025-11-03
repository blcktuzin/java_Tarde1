package Atv_18Mod;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de notas: ");
        int totalNotas = sc.nextInt();

        double soma = 0;
        double nota;

        for (int i = 1; i <= totalNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                i--;
            } else {
                soma += nota;
            }
        }

        double media = soma / totalNotas;
        System.out.println("A média do aluno é: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        sc.close();
    }
}

