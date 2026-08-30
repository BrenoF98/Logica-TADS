import java.util.Scanner;

public class Ex4ParesDeUmIntervalo {
    public static void main(String[] args) {

        /*
         * 4. Pares de um intervalo
         * Leia um número inteiro positivo n e apresente todos os números pares
         * existentes entre 1 e n.
         * 
         * Ao final, informe também quantos números pares foram encontrados.
         */

        Scanner entrada = new Scanner(System.in);

        int numeroN = 0, contador = 2, quantNumPar = 0;

        System.out.println("Escreva um numero inteiro: ");
        numeroN = entrada.nextInt();
        System.out.println("");

        while (contador < numeroN) { // conta os numeros entre 1 e n (1 < x < n)

            if (contador % 2 == 0) {
                System.out.println(contador + " é número par");
                quantNumPar++;
            }
            contador++;
        }

        System.out.println("");
        System.out.println("Há " + quantNumPar + " números pares entre 1 e " + numeroN);

        entrada.close();

    }
}
