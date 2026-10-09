import java.util.Scanner;

public class Ex32LetraX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 32. Letra X
         * Leia um tamanho impar n e desenhe um X. Imprima * quando a coluna for igual a
         * linha ou quando a coluna for a distancia entre a linha e o fim da figura
         */

        System.out.print("Informe um valor impar: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= (n *2) - 2; i++) {
            for (int j = 0; j <= (n *2) - 2; j++) {
                if (j == i || j == (n *2) - 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
