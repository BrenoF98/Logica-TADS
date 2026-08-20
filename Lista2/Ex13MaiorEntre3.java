import java.util.Scanner;

public class Ex13MaiorEntre3 {
    public static void main(String[] args) {
        /*
         * 13. Maior entre três números
         * Leia três números inteiros e informe qual é o maior.
         * O programa também deve identificar o caso em que os três valores são iguais.
         */

        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Escreva três números: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        if (num1 != num2 || num1 != num3) {
            if (num1 >= num2 && num1 >= num3) {

                System.err.println("O número " + num1 + " é mior");

            } else if (num2 >= num3) {

                System.err.println("O número " + num2 + " é mior");

            } else {
                System.err.println("O número " + num3 + " é mior");
            }

        } else {
            System.err.println("Os três números são iguais");
        }

        entrada.close();

    }
}
