package Atv_18Mod;

import java.util.Scanner;

public class conversor {
    public class main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("=== Conversor de Temperatura ===");
            System.out.println("Digite a temperatura e o tipo de conversão separados por espaço:");
            System.out.println("Exemplo: '25 CtoF' para Celsius → Fahrenheit");
            System.out.println("Exemplo: '77 FtoC' para Fahrenheit → Celsius");
            System.out.print("Entrada: ");

            String entrada = sc.nextLine();

            String[] partes = entrada.split(" ");
            if (partes.length != 2) {
                System.out.println("Entrada inválida! Use o formato: valor tipoConversao (ex: 25 CtoF)");
                return;
            }

            double temperatura = Double.parseDouble(partes[0]);
            String tipoConversao = partes[1];
            double resultado;

            if (tipoConversao.equalsIgnoreCase("CtoF")) {
                resultado = conversor.celsiusParaFahrenheit(temperatura);
                System.out.println(temperatura + "°C equivalem a " + resultado + "°F");
            } else if (tipoConversao.equalsIgnoreCase("FtoC")) {
                resultado = conversor.fahrenheitParaCelsius(temperatura);
                System.out.println(temperatura + "°F equivalem a " + resultado + "°C");
            } else {
                System.out.println("Tipo de conversão inválido! Use 'CtoF' ou 'FtoC'.");
            }

            sc.close();
        }
    }

    private static double fahrenheitParaCelsius(double temperatura) {

        return temperatura;
    }

    private static double celsiusParaFahrenheit(double temperatura) {
        return temperatura;
    }
}
