package Lista6;

//import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    /*
     * Exercício 11 — Leitura fora da diagonal
     * Crie uma matriz de inteiros 5 x 5.
     * 
     * Leia do usuário somente os elementos que não pertencem à diagonal principal.
     * Os elementos da diagonal principal deverão receber automaticamente o valor 0,
     * sem serem solicitados.
     * 
     * Ao final, apresente a matriz completa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random();

        int[][] m = new int[5][5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i != j) {
                    System.out.printf("\ninforme o valor para a posição %d,%d: ", i, j);
                    //m[i][j] = random.nextInt(-15,16);
                    m[i][j] = scanner.nextInt();
                } // não é necessario colocar 0 pois a matriz já é inicializada com zeros.

            }
            System.out.println();
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.printf(" %3d", m[i][j]);

            }
            System.out.println();
        }
        scanner.close();

    }

}
