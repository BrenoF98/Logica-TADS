import java.util.Scanner;

public class Ex18Piramide {
    public static void main(String[] args) {
        /*
         * 18. Piramide
         * Leia uma altura impar n e desenhe uma piramide centralizada. Cada linha deve
         * conter espacos antes dos asteriscos e uma quantidade impar de asteriscos.
         */

        Scanner scanner = new Scanner(System.in);

        /*
         * Primeira fatoração.
         * System.out.println("informe a altura n da piramide: ");
         * 
         * int altura = scanner.nextInt();
         * 
         * for (int i = 0; i < altura; i++) { // conta as linhas.
         * 
         * // centraliza.
         * for (int j = (altura * 2) - 2; j > i * 2; j--) {
         * System.out.print(" ");
         * }
         * 
         * // constroi a piramide.
         * for (int k = 0; k <= (i * 2); k++) {
         * System.out.print("* ");
         * }
         * System.out.println("");
         * }
         * scanner.close();
         * }
         * }
         */
        /*
         *
         * * *
         * * * * *
         * * * * * * *
         * * * * * * * * *
         */

        System.out.println("informe a altura n da piramide: ");
        int altura = scanner.nextInt();
        int base = altura * 2;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (j < altura - i) {
                    System.out.print(" ");
                } else if (j <= altura + (i)) {

                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        scanner.close();
    }
}