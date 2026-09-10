import java.util.Scanner;

public class Ex1NumerosdeXaY {
    public static void main(String[] args) {

        /*
         * Faça um programa que mostra os numeros de X a Y onde X e Y são números
         * interios fornecidos pelo usuário que insira os valores de X e Y e, em seguida
         * exibir todos os numeros inteiros entre esses valores, inclusive.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Estava um numero inteiro (X): ");
        int numeroX = entrada.nextInt();

        System.out.println("Estava um numero inteiro (Y): ");
        int numeroY = entrada.nextInt();
        if (numeroX < numeroY) {

            while (numeroX <= numeroY) {

                System.out.println(" -> " + numeroX);

                numeroX++;

            }

        } else {
            while (numeroX >= numeroY) {
                System.out.println(" -> " + numeroX);

                numeroX--;
            }
        }
        entrada.close();
    }
}
