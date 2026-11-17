package Lista6;

import java.util.Random;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] m = new int[5][5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int n = random.nextInt(-10, 21); // sorteia um numero de -10 até 20.
                m[i][j] = n;
                System.out.printf(" %3d", m[i][j]);
            }
            System.out.println();

        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        int X;

        do {

            System.out.print("Informe um valor X inteiro: ");
            X = scanner.nextInt();
            if (X == -999) break;
            
            int linhasIguais = 0;
            for (int i = 0; i < m.length; i++) {
                int somaLinha = 0;
                for (int j = 0; j < m[i].length; j++) {
                    somaLinha += m[i][j];
                }

                if (somaLinha == X) {
                    System.out.println("Linha" + i);
                    linhasIguais++;
                }

            }

            if (linhasIguais == 0) {
                System.out.println("Nenhuma linha soma " + X);
                System.out.println();
            }
        } while (X != -999);

        scanner.close();
    }

}
