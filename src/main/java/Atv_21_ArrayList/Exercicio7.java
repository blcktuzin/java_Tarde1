package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        ArrayList<String> palavras = lerPalavras();
        int minimo = lerTamanhoMinimo();
        removerCurtas(palavras, minimo);
        imprimirLista(palavras);
    }

    public static ArrayList<String> lerPalavras() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String palavra;

        System.out.println("Digite palavras (ou FIM para encerrar):");
        do {
            palavra = sc.nextLine().trim();
            if (!palavra.equalsIgnoreCase("FIM") && !palavra.isEmpty()) {
                lista.add(palavra);
            }
        } while (!palavra.equalsIgnoreCase("FIM"));

        return lista;
    }

    public static int lerTamanhoMinimo() {
        Scanner sc = new Scanner(System.in);
        int tamanho;
        do {
            System.out.println("Digite o tamanho mínimo permitido:");
            tamanho = sc.nextInt();
            if (tamanho <= 0) {
                System.out.println("Valor inválido. Digite um número maior que 0.");
            }
        } while (tamanho <= 0);
        return tamanho;
    }

    public static void removerCurtas(ArrayList<String> lista, int minimo) {
        lista.removeIf(p -> p.length() < minimo);
    }

    public static void imprimirLista(ArrayList<String> lista) {
        System.out.println("\n--- Lista Final ---");
        for (String palavra : lista) {
            System.out.println(palavra);
        }
    }
}