

import java.util.Scanner;

public class Repeticao7 {

    public static void main(String[] args) {
        // leia 10 valores e conte os pares e impares;
        Scanner entrada = new Scanner(System.in);

        int contador = 0, numero, quantPar = 0, quantImpar = 0;

        while (contador < 10) {
        System.out.println("Informe um número: ");
        numero = entrada.nextInt();
            contador++;
            if (numero % 2 == 0) {
                quantPar++;
            } else {
                quantImpar++;
            }

        }

        System.out.println(quantPar + " números pares.");
        System.out.println(quantImpar + " números pares.");
        entrada.close();
    }
}
