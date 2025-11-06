package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- MENU DE PRODUTOS ---");
            System.out.println("1 - Adicionar preço");
            System.out.println("2 - Listar todos");
            System.out.println("3 - Listar preços acima de X");
            System.out.println("4 - Limpar lista");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> adicionarPreco(precos);
                case 2 -> listarPrecos(precos);
                case 3 -> listarAcimaDe(precos);
                case 4 -> limparLista(precos);
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void adicionarPreco(ArrayList<Double> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        if (preco > 0) {
            lista.add(preco);
            System.out.println("Preço adicionado.");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public static void listarPrecos(ArrayList<Double> lista) {
        System.out.println("\n--- Lista de Preços ---");
        if (lista.isEmpty()) {
            System.out.println("Nenhum preço cadastrado.");
        } else {
            for (double p : lista) {
                System.out.println("R$ " + p);
            }
        }
    }

    public static void listarAcimaDe(ArrayList<Double> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Listar preços acima de: ");
        double limite = sc.nextDouble();

        System.out.println("\n--- Preços acima de R$ " + limite + " ---");
        boolean encontrou = false;
        for (double p : lista) {
            if (p > limite) {
                System.out.println("R$ " + p);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum preço acima desse valor.");
        }
    }

    public static void limparLista(ArrayList<Double> lista) {
        lista.clear();
        System.out.println("Lista limpa.");
    }
}