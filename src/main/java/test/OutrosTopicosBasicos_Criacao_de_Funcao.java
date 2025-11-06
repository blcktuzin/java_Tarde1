package test;

import java.util.Scanner;

import static test.funcClass.a;
import static test.funcClass.showResult;

public class OutrosTopicosBasicos_Criacao_de_Funcao {
    static funcClass func = new funcClass();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        func.a = sc.nextInt();
        func.b = sc.nextInt();
        func.c = sc.nextInt();

        System.out.println("O numero maior é: "+ func.max());
    }
}

