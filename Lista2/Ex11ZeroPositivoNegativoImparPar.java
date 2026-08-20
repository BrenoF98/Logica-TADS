import java.util.Scanner;

public class Ex11ZeroPositivoNegativoImparPar {

    /*
     * 11. Positivo, negativo e paridade
     * 
     * Leia um número inteiro. Primeiro informe se ele é positivo, negativo ou zero.
     * Depois, caso seja diferente de zero, informe também se ele é par ou ímpar.
     * 
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.print("Informe um numero inteiro: ");
        numero = entrada.nextInt();

        if (numero != 0) {

            if (numero > 0) {
                System.out.println("O número é Positivo");

            } else {
                System.out.println("O número é Negativo");
            }

            if (numero % 2 == 0) {

                System.out.println("O número é PAR");

            } else {
                System.out.println("O número é IMPAR");
            }

        } else {
            System.out.println("O número é ZERO");
        }

        entrada.close();

    }

}