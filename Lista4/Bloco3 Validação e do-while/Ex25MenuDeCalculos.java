import java.util.Scanner;

public class Ex25MenuDeCalculos {
    public static void main(String[] args) {

        /*
         * 25. Menu de calculos
         * Crie um menu repetitivo com do-while e switch:
         * 
         * 1 - Dobro
         * 2 - Triplo
         * 3 - Quadrado
         * 0 - Sair
         */
        Scanner scanner = new Scanner(System.in);

        int op;
        float numero, dobro, triplo, quadrado;

        do {
            
            System.out.print("\nInforme um Numero real: ");
            numero = scanner.nextFloat();

            System.out.printf("""
                    1 - Dobro
                    2 - Triplo
                    3 - Quadrado
                    0 - Sair

                    -> """);

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    dobro = numero * 2;
                    System.out.printf("%.2f X 2 = %.2f", numero, dobro);
                    
                    break;
                case 2:
                    triplo = numero * 3;
                    System.out.printf("%.2f X 3 = %.2f", numero, triplo);
                    break;
                case 3:
                    quadrado = numero * numero;
                    System.out.printf("%.2f^2 = %.2f", numero, quadrado);

                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção INVALIDA!");
                    break;
            }
        } while (op != 0);
        scanner.close();
    }
}
