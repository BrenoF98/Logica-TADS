package Lista6;

import java.util.Random;

public class Ex10 {

    /*
     * Exercício 10 — Regiões da diagonal principal
     * Preencha uma matriz 6 x 6 com valores aleatórios entre 0 e 99 e apresente-a.
     * 
     * Em seguida:
     * 
     * Apresente somente os elementos que estão acima da diagonal principal.
     * Apresente somente os elementos que estão abaixo da diagonal principal.
     * Calcule a soma dos elementos de cada uma dessas duas regiões.
     * Observe a relação entre os índices i e j em cada região: acima da diagonal (i
     * < j), na diagonal (i == j) e abaixo da diagonal (i > j).
     */
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[6][6];
        int somaAbaixo = 0, somaAcima = 0;
        System.out.println("Matriz completa: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(100);
                System.out.printf(" %3d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nElementos acima da diag. princ.: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j) {
                    System.out.printf(" %3d", matriz[i][j]);
                    somaAcima += matriz[i][j];

                } else {
                    System.out.print("  --");
                }
            }
            System.out.println();
        }
        System.out.println("Soma dos elementos acima: " + somaAcima);

        System.out.println("\nElementos abaixo da diag. princ.: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i > j) {
                    System.out.printf(" %3d", matriz[i][j]);
                    somaAbaixo += matriz[i][j];
                } else {
                    System.out.print("  --");
                }
            }
            System.out.println();
        }
        System.out.println("Soma dos elementos abaixo: " + somaAbaixo);

    }
}
