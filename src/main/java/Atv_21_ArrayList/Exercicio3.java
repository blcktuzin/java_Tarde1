package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        ArrayList<Double> gastos = lerGastos();
        imprimirGastos(gastos);
    }

    public static ArrayList<Double> lerGastos() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();
        double valor;

        do {
            System.out.println("Digite o valor da compra (0 para encerrar):");
            valor = sc.nextDouble();
            if (valor != 0) {
                lista.add(valor);
            }
        } while (valor != 0);

        return lista;
    }

    public static void imprimirGastos(ArrayList<Double> lista) {
        double soma = 0;
        System.out.println("\n--- Lista de Gastos ---");
        for (double valor : lista) {
            System.out.println("R$ " + valor);
            soma += valor;
        }
        double media = lista.isEmpty() ? 0 : soma / lista.size();
        System.out.println("Soma total: R$ " + soma);
        System.out.println("Média dos gastos: R$ " + media);
    }
}