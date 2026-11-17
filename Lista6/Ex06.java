package Lista6;

import java.util.Random;

public class Ex06 {

    public static void main(String[] args) {

        /*
         * 
         * Exercício 6 — Contagem de valores
         * Leia uma matriz 4 x 4 de números inteiros.
         * 
         * Determine e apresente:
         * 
         * A quantidade de valores maiores que 10.
         * A quantidade de valores pares e de valores ímpares.
         * A quantidade de valores negativos.
         */

        // Iniciando RANDOM para gerar uma matriz 4x4 com numeros aleatorios.
        // Dentro do main (crie apenas uma vez antes dos laços for/while):
        Random random = new Random();

        int[][] m = new int[4][4];
        int contMaior10 = 0, contNegativos = 0, contPares = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int n = random.nextInt(-10, 21); // sorteia um numero de -10 até 20.
                m[i][j] = n;
                System.out.printf(" %3d", m[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\nElementos MAIORES QUE 10: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] > 10) {
                    System.out.printf(" %3d", m[i][j]);
                    contMaior10++;
                } else {
                    System.out.print("  **");

                }
            }
            System.out.println();
        }

        System.out.println("\nQuantidade de MAIORES QUE 10: " + contMaior10);

        System.out.println("\n\nElementos PARES: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] % 2 == 0) {
                    System.out.printf(" %3d", m[i][j]);
                    contPares++;
                } else {
                    System.out.print("  **");

                }
            }
            System.out.println();
        }
        System.out.println("\nQuantidade de PARES: " + contPares);

        System.out.println("\n\nElementos NEGATIVOS: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] < 0) {
                    System.out.printf(" %3d", m[i][j]);
                    contNegativos++;
                } else {
                    System.out.print("  **");

                }
            }
            System.out.println();
        }
        System.out.println("\nQuantidade de NEGATIVOS: " + contNegativos);
        System.out.println();

    }
}
