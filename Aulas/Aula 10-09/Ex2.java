import java.util.Random;
import java.util.Scanner;


public class Ex2 {

    public static void main(String[] args) {

        /*
         * Faça um programa que repita um laço de repetiçao até que o valor informado
         * seja igual a um valor especifico
         */
        Scanner entrada = new Scanner(System.in);

        Random aleatorio = new Random();
        final int N = aleatorio.nextInt(10) + 1;

        System.out.println("Valor aleatorio: " + N);

        System.out.println("Informe um valor inteiro: ");
        int valorInformado = entrada.nextInt();

        if (valorInformado < N) {

            while (valorInformado <= N) {

                System.out.println(" -> " + valorInformado);

                valorInformado++;

            }

        } else {
            while (valorInformado >= N) {
                System.out.println(" -> " + valorInformado);

                valorInformado--;
            }
        }
        entrada.close();
    }
}