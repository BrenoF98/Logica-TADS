import java.util.Scanner;

public class Ex22MenuDeConversao {
    public static void main(String[] args) {

        /*
         * 22. Menu de conversao
         * Exiba repetidamente, usando do-while, o menu:
         * 
         * 1 - Celsius para Fahrenheit
         * 2 - Fahrenheit para Celsius
         * 3 - Quilometros para milhas
         * 0 - Sair
         */

        Scanner scanner = new Scanner(System.in);
        int op;

        float celsius;
        float fahrenheit;
        float quilometros;
        float milhas;

        do {

            System.out.print("""

                    1 - Celsius para Fahrenheit
                    2 - Fahrenheit para Celsius
                    3 - Quilometros para milhas
                    0 - Sair

                    Opção:  """);
            op = scanner.nextInt();
            switch (op) {
                case 1:

                    System.out.print("\nInforme a temperatura em Celsius: ");
                    celsius = scanner.nextFloat();

                    fahrenheit = (celsius * 9 / 5) + 32;

                    System.out.printf("%n%.2f °C = %.2f °F%n", celsius, fahrenheit);

                    break;

                case 2:

                    System.out.print("\nInforme a temperatura em Fahrenheit: ");
                    fahrenheit = scanner.nextFloat();

                    celsius = (fahrenheit - 32) * 5 / 9;

                    System.out.printf("\n%.2f °C = %.2f °F\n", celsius, fahrenheit);

                    break;

                case 3:

                    System.out.print("\nInforme a distancia em Quilometros: ");
                    quilometros = scanner.nextFloat();

                    milhas = quilometros / 1.609f;

                    System.out.printf("\n%.2f km = %.2f mi\n", quilometros, milhas);

                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        } while (op != 0);

        scanner.close();

    }
}
