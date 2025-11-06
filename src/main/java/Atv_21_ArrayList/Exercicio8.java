package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        ArrayList<String> codigos = lerCodigos();
        buscarOcorrencias(codigos);
    }

    public static ArrayList<String> lerCodigos() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String codigo;

        System.out.println("Digite os códigos (ou FIM para encerrar):");
        do {
            codigo = sc.nextLine().trim();
            if (!codigo.equalsIgnoreCase("FIM") && !codigo.isEmpty()) {
                lista.add(codigo);
            }
        } while (!codigo.equalsIgnoreCase("FIM"));

        return lista;
    }

    public static void buscarOcorrencias(ArrayList<String> lista) {
        Scanner sc = new Scanner(System.in);
        String alvo;

        do {
            System.out.println("Digite o código a buscar (ou SAIR para encerrar):");
            alvo = sc.nextLine().trim();
            if (!alvo.equalsIgnoreCase("SAIR")) {
                int cont = 0;
                for (String c : lista) {
                    if (c.equalsIgnoreCase(alvo)) {
                        cont++;
                    }
                }
                System.out.println("O código " + alvo + " aparece " + cont + " vez(es).");
            }
        } while (!alvo.equalsIgnoreCase("SAIR"));
    }
}