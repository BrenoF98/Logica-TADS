package Lista5;

import java.util.Scanner;

public class Ex06PositivosNegativosEZero {
    public static void main(String[] args) {

        /*
         * Leia um vetor de 15 números inteiros.
         * 
         * Determine a quantidade de elementos positivos, negativos e iguais a zero.
         * 
         * Calcule também a soma dos positivos e a soma dos negativos, separadamente.
         */

        Scanner scanner = new Scanner(System.in);

        int[] numerosInt = { 0, -7, 2, 0, 5, 5, 1, -7, 1, 1, 0, 1, 1, 1, -14 };
        int contPositivo = 0, contNegativo = 0, contZeros = 0;
        int somaPositivos = 0, somaNegativos = 0;

        for (int i = 0; i < numerosInt.length; i++) {
            if (numerosInt[i] > 0) {
                contPositivo++;
                somaPositivos += numerosInt[i];
            } else if (numerosInt[i] < 0) {
                contNegativo++;
                somaNegativos += numerosInt[i];
            } else {
                contZeros++;
            }
        }

        System.out.printf("""

            Quantidade de Positivos........:  %02d
            Quantidade de Negativos........:  %02d
            Quantidade de Zeros............:  %02d 

            Soma Dos Positivos.............:  %02d
            Soma Dos Negativos.............: %02d
            
            """, contPositivo, contNegativo, contZeros, somaPositivos, somaNegativos);
        

        scanner.close();
    }
}
