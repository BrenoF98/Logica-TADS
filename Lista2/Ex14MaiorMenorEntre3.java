import java.util.Scanner;

public class Ex14MaiorMenorEntre3 {

    public static void main(String[] args) {
        /*
         * 14. Menor e maior entre três valores
         * 
         * Leia três números inteiros e informe:
         * 
         * o maior valor;
         * o menor valor.
         * Considere que os valores podem ser iguais.
         * 
         */
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Escreva três números: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        if (num1 != num2 || num1 != num3) {

            if (num1 >= num2 && num1 >= num3) {

                System.err.println("O número " + num1 + " é maior");

            } else if (num2 >= num3) {

                System.err.println("O número " + num2 + " é maior");

            } else {
                System.err.println("O número " + num3 + " é maior");
            }

            if (num1 <= num2 && num1 <= num3) {

                System.err.println("O número " + num1 + " é menor");

            } else if (num2 <= num3) {

                System.err.println("O número " + num2 + " é menor");

            } else {
                System.err.println("O número " + num3 + " é menor");
            }

        } else {
            System.err.println("Os três números são iguais");
        }

        entrada.close();
    }
}