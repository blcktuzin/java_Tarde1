package Atv_18Mod;


import java.util.Scanner;

public class calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida!");
            return 0;
        }
        return a / b;

    }
         class Principal {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int opcao;
                double num1, num2, resultado;

                System.out.println("=== CALCULADORA MODULARIZADA ===");

                do {
                    System.out.println("Escolha uma operação:");
                    System.out.println("1 - Soma");
                    System.out.println("2 - Subtração");
                    System.out.println("3 - Multiplicação");
                    System.out.println("4 - Divisão");
                    System.out.println("0 - Sair");
                    System.out.print("Opção: ");
                    opcao = sc.nextInt();

                    if (opcao >= 1 && opcao <= 4) {
                        System.out.print("Digite o primeiro número: ");
                        num1 = sc.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        num2 = sc.nextDouble();

                        resultado = 0;

                        if (opcao == 1) {
                            resultado = calculadora.somar(num1, num2);
                            System.out.println("Resultado da soma: " + resultado);
                        } else if (opcao == 2) {
                            resultado = calculadora.subtrair(num1, num2);
                            System.out.println("Resultado da subtração: " + resultado);
                        } else if (opcao == 3) {
                            resultado = calculadora.multiplicar(num1, num2);
                            System.out.println("Resultado da multiplicação: " + resultado);
                        } else if (opcao == 4) {
                            resultado = calculadora.dividir(num1, num2);
                            if (num2 != 0) {
                                System.out.println("Resultado da divisão: " + resultado);
                            }
                        }
                    } else if (opcao != 0) {
                        System.out.println("Opção inválida! Tente novamente.");
                    }

                } while (opcao != 0);

                System.out.println("\n=== Programa encerrado ===");
            }
        }
    }

