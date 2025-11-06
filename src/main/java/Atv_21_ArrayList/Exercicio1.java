package Atv_21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        ArrayList<String> tarefas = lerTarefas();
        imprimirTarefas(tarefas);
    }

    public static ArrayList<String> lerTarefas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas tarefas separadas por vírgula (,):");
        String linha = sc.nextLine();

        String[] partes = linha.split(",");
        ArrayList<String> lista = new ArrayList<>();

        for (String tarefa : partes) {
            tarefa = tarefa.trim();
            if (!tarefa.isEmpty()) {
                lista.add(tarefa);
            }
        }

        return lista;
    }

    public static void imprimirTarefas(ArrayList<String> lista) {
        System.out.println("\n--- Lista de Tarefas ---");
        int numero = 1;
        for (String tarefa : lista) {
            System.out.println(numero + ". " + tarefa);
            numero++;
        }
    }
}

