import java.util.Scanner;

public class Ex35Diagonais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 35. Diagonais
         * Leia um tamanho n e desenhe duas figuras, uma com a diagonal principal e
         * outra com a diagonal secundaria. Use dois lacos aninhados e uma condicao para
         * decidir onde imprimir *.
         */
        System.out.println("Informe um tamanho n: ");
        int n = scanner.nextInt();
        System.out.println("\n--- Diagonal Principal ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        
        }
        System.out.println("\n--- Diagonal Secundaria ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
