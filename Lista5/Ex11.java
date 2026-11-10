package Lista5;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Leia 15 números inteiros e armazene-os em um vetor.
         * 
         * Solicite um número X e procure por ele no vetor. O programa deverá apresentar
         * o índice da primeira ocorrência ou uma mensagem informando que o valor não
         * foi encontrado.
         */


        // lê uma quantidade N de numeros inteiros e armezena em um vetor: 

        System.out.print("informe a quantidade de elementos para o vetor: "); 
        int quantNum = scanner.nextInt();
        int [] vetor_A = new int [quantNum];
        System.out.println("Informe " + quantNum + " inteiros: ");
        for (int i = 0; i < quantNum; i++) {
            vetor_A [i]= scanner.nextInt();
        }

        System.out.print("Informe um número inteiro X: ");
        int X = scanner.nextInt();
        

        int idx = 0;

        while (true) {
            boolean existe = false; 
            
            if (idx == vetor_A.length) {
                System.out.println("O Número " + X + " Não existe no vetor!");
                break;
            }
            
            existe = vetor_A[idx] == X;

            if (!existe) {
                idx++;
            } else if (existe) {
                System.out.print("O Número " + X + " ocorre pela primeira vez na posição " + idx + " do vetor.");
                break;
            }
            
        }

        scanner.close();
    }
}
