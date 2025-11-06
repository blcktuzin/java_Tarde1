package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        ArrayList<String> palavras = lerPalavras();
        imprimirCurtas(palavras);
    }

    public static ArrayList<String> lerPalavras() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto:");
        String texto = sc.nextLine();

        String[] partes = texto.split("\\s+");
        ArrayList<String> lista = new ArrayList<>();

        for (String p : partes) {
            if (!p.isEmpty()) {
                lista.add(p);
            }
        }

        return lista;
    }

    public static void imprimirCurtas(ArrayList<String> lista) {
        System.out.println("\n--- Palavras com até 4 letras ---");
        for (String palavra : lista) {
            if (palavra.length() <= 4) {
                System.out.println(palavra);
            }
        }
    }
}






