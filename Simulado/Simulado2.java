
import java.util.Scanner;

public class Simulado2 {
    public static void main(String[] args) {
        /*
         * Escreva um algoritmo em Java que receba vários números e verifique se eles
         * são ou não quadrados perfeitos. O algoritmo termina a execução quando for
         * digitado um número menor ou igual a 0. (Um número é quadrado perfeito quando
         * tem um número inteiro como raiz quadrada.).
         * Obs: não deve ser utilizado métodos da classe Math.
         */
        Scanner sc = new Scanner(System.in);
        int numero;
        int quadrado;
        do {
            System.out.printf("\nInforme um numero a ser testado: ");
            numero = sc.nextInt();
            boolean isQuadPerf = false;

            if (numero <= 0) break;

            for (int i = 1; i < numero ; i++) { 
                quadrado = i * i;
                if (numero == quadrado) {
                    System.out.printf("\n%d é quadrado perfeito, sua raiz é: %d", numero, i);
                    isQuadPerf = true;
                }

            }
            if (!isQuadPerf) {
                System.out.printf("\n%d não é quadrado perfeito.\n", numero);

            }

        } while (numero > 0);

        sc.close();
    }
}
