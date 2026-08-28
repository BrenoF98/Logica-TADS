

import java.util.Scanner;

public class Repeticao7 {

    public static void main(String[] args) {
        // leia 10 valores e conte os pares e impares;
        Scanner entrada = new Scanner(System.in);

        int contador = 0, numero, quanTPar = 0, quantImpar = 0;

        System.out.println("Informe um número: ");
        numero = entrada.nextInt();

        while (contador < 10) {
            contador++;
            if (numero % 2 == 0) {
                quanTPar++;
            } else {
                quantImpar++;
            }

        }

        System.out.println("");

    }
}
