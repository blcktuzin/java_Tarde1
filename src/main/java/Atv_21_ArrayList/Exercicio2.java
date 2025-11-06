package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        ArrayList<String> nomes = lerNomes();
        imprimirNomes(nomes);
    }

    public static ArrayList<String> lerNomes() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String nome;

        do {
            System.out.println("Digite um nome (ou FIM para encerrar):");
            nome = sc.nextLine().trim();
            if (!nome.equalsIgnoreCase("FIM")) {
                boolean existe = false;
                for (String n : lista) {
                    if (n.equalsIgnoreCase(nome)) {
                        existe = true;
                        break;
                    }
                }
                if (!existe && !nome.isEmpty()) {
                    lista.add(nome);
                }
            }
        } while (!nome.equalsIgnoreCase("FIM"));

        return lista;
    }

    public static void imprimirNomes(ArrayList<String> lista) {
        System.out.println("\n--- Lista de Nomes ---");
        for (String nome : lista) {
            System.out.println(nome);
        }
    }
}