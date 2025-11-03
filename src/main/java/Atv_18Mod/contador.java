package Atv_18Mod;

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("=== Contador de Palavras ===");
                System.out.print("Digite uma frase: ");
                String frase = sc.nextLine();

                int quantidade = contador.contarPalavras(frase);
                System.out.println("Quantidade de palavras: " + quantidade);

                sc.close();
            }
        }
    }

    private static int contarPalavras(String frase) {

        return 0;
    }
}
