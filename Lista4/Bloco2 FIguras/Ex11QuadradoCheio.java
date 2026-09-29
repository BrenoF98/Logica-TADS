import java.util.Scanner;

public class Ex11QuadradoCheio {
    public static void main(String[] args) {

        /*
         * 11. Quadrado cheio
         * Leia o lado n e desenhe um quadrado cheio de asteriscos com n linhas e n
         * colunas.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado do quadrado: ");
        int lado = scanner.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        scanner.close();
    }
}
