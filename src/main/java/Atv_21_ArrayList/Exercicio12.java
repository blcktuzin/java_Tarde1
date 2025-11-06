package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        ArrayList<String> fila = lerNomes();
        int k = lerRotacoes();
        rotacionarFila(fila, k);
        imprimirFila(fila);
    }

    public static ArrayList<String> lerNomes() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String nome;

        System.out.println("Digite os nomes (ou FIM para encerrar):");
        do {
            nome = sc.nextLine().trim();
            if (!nome.equalsIgnoreCase("FIM") && !nome.isEmpty()) {
                lista.add(nome);
            }
        } while (!nome.equalsIgnoreCase("FIM"));

        return lista;
    }

    public static int lerRotacoes() {
        Scanner sc = new Scanner(System.in);
        int k;
        do {
            System.out.print("Digite o número de rotações: ");
            k = sc.nextInt();
            if (k < 0) {
                System.out.println("Valor inválido. Digite um número não negativo.");
            }
        } while (k < 0);
        return k;
    }

    public static void rotacionarFila(ArrayList<String> lista, int k) {
        int tamanho = lista.size();
        if (tamanho == 0 || k == 0) return;

        for (int i = 0; i < k; i++) {
            String primeiro = lista.remove(0);
            lista.add(primeiro);
        }
    }

    public static void imprimirFila(ArrayList<String> lista) {
        System.out.println("\n--- Ordem Final da Fila ---");
        for (String nome : lista) {
            System.out.println(nome);
        }
    }
}