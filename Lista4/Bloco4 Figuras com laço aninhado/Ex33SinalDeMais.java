import java.util.Scanner;

public class Ex33SinalDeMais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * 33. Sinal de mais
         * Leia um tamanho impar n e desenhe um sinal de +: a linha e a coluna centrais
         * devem conter asteriscos; as demais posicoes devem conter espacos.
         */
        int n = -1;
        do {

            System.out.print("Informe um valor impar: ");
            n = scanner.nextInt();

            if (n <= 0)
                break;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == n / 2 || i == n / 2) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } while (n != 0);
        scanner.close();
    }
}
