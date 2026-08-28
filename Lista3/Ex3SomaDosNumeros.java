package Lista3;

import java.util.Scanner;

public class Ex3SomaDosNumeros {
    public static void main(String[] args) {
        // entrada

        int numero;

        // processamento
        int soma = 0, contador = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um numero inteiro: ");
        numero = entrada.nextInt();

        if (numero > 0) {

            while (contador < numero) {
                contador++;
                soma += contador;

                
            }
            System.out.println("A soma de 1 até " + numero + " é " +soma);
        } else {
            System.out.println("Valor invalido!");
        }
        entrada.close();
    }
}
