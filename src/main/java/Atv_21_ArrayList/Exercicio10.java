package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        ArrayList<String> emails = lerEmails();
        imprimirEmails(emails);
    }

    public static ArrayList<String> lerEmails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os e-mails separados por vírgula (,):");
        String linha = sc.nextLine();

        String[] partes = linha.split(",");
        ArrayList<String> lista = new ArrayList<>();

        for (String e : partes) {
            String email = e.trim().toLowerCase();
            if (!email.isEmpty() && !lista.contains(email)) {
                lista.add(email);
            }
        }

        return lista;
    }

    public static void imprimirEmails(ArrayList<String> lista) {
        System.out.println("\n--- Lista de E-mails Normalizados e Únicos ---");
        for (String email : lista) {
            System.out.println(email);
        }
    }
}