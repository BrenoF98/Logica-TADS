import java.util.Scanner;

public class ValidandoLinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // faça um programa que indique quais linhas da matriz não tem valores
        // negativos.

        int[][] m = {
                { 1, 0, 0, 1 },
                { 1, 0, 1, 0 },
                { -1, 0, 0, 1 },
                { 0, 1, 1, 0 },
                { 1, 0, 0, -1 }
        };

        for (int i = 0; i < m.length; i++) {
            boolean todosPositivos = true;
            for (int j = 0; j < m[i].length && todosPositivos; j++) {
                todosPositivos = m[i][j] >= 0;
            }
            if (todosPositivos) {
                System.out.printf("A linha %d é inteiramente positiva.\n", i);
            } else {
                System.out.printf("A linha %d não é inteiramente positiva.\n", i);
            }
        }

        scanner.close();
    }
}
