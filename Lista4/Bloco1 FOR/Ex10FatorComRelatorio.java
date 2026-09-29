import java.util.Scanner;

public class Ex10FatorComRelatorio {
    public static void main(String[] args) {

        /*
         * 10. Fatorial com relatorio
         * Leia um inteiro de 0 a 12. Calcule seu fatorial e apresente cada
         * multiplicacao realizada. Para zero, considere 0! = 1.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor de 0 a 12: ");
        int numeroInt = scanner.nextInt();

        int fatorial = 1;
        int anterior = 1;

        if (numeroInt <= 12 && numeroInt >= 0) {

            for (int i = 0; i <= numeroInt; i++) {
                if (i == 0) {
                    System.out.printf("\n0! = 1");
                } else {

                    
                    anterior = fatorial;

                    fatorial *= i;
                    System.out.printf("\n%d! = %d X %d = %d", i, anterior, i, fatorial);
                    

                }
            }
        } else if (numeroInt <= 0) {

            System.out.println("Informe um valor não negativo!");
        } else if (numeroInt >= 12) {
            System.out.println("Informe um valor de 1 a 12!");

        }

        scanner.close();
    }
}
