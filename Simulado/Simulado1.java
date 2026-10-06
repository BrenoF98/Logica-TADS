
import java.util.Scanner;

public class Simulado1 {
    public static void main(String[] args) {
        /*
         * Escreva um programa em JAVA para calcular a média de valores PARES e a média
         * dos valores ÍMPARES, que serão digitados pelo usuário. Ao final, o algoritmo
         * deve mostrar estas duas médias. O algoritmo deve mostrar também o maior
         * número PAR digitado e o menor número ÍMPAR digitado. Para finalizar o
         * usuário irá digitar um valor negativo.
         */
        Scanner sc = new Scanner(System.in);

        int numero;
        int somaImpares = 0, somaPares = 0;
        int contImpar = 0, contPar = 0;
        int mediaImpar, mediaPar;
        int maiorPar = Integer.MIN_VALUE, menorImpar = Integer.MAX_VALUE;

        do { // laço indeterminado.
            System.out.println("Para finalizar digite um valor negativo.");
            System.out.print("\nInforme um valor inteiro: ");
            numero = sc.nextInt();

            if (numero < 0) break;

                if (numero % 2 == 0) {// par
                    somaPares += numero;
                    contPar++;
                    if (maiorPar < numero) {
                        maiorPar = numero;
                    }
                } else { // impar
                    somaImpares += numero;
                    contImpar++;
                    if (menorImpar > numero) {
                        menorImpar = numero;
                    }
                }
            

        } while (numero >= 0);

        if (contPar > 0) {
            
            mediaPar = somaPares / contPar;
            System.out.printf("\nMédia dos Pares: %d\n", mediaPar);
            
            System.out.printf("\nMaior Par: %d", maiorPar);
        }
        
        if (contImpar > 0) {
            
            mediaImpar = somaImpares / contImpar;
            System.out.printf("\nMédia dos Ímpares: %d\n", mediaImpar);
            System.out.printf("\nMenor Ímpar: %d\n", menorImpar);
            
        }

        sc.close();

    }
}
