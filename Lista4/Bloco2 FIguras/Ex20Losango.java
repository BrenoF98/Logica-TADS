import java.util.Scanner;

public class Ex20Losango {
    public static void main(String[] args) {

        /*
         * 20. Losango
         * Leia uma altura impar n e desenhe um losango formado por uma piramide
         * crescente seguida de uma piramide decrescente.
         */
        Scanner scanner = new Scanner(System.in);
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
        for (int i = -1; i < altura; i++) { // -1 adiciona uma linha
            for (int j = 0; j <= base; j++) { // adiciona um asterisco a mais.
                if (j <= i) {
                    System.out.print(" ");
                } else if (j < base - (i)) {

                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        scanner.close();
    }
}
