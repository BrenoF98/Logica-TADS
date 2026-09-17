import java.util.Scanner;

public class Ex1Tabuada {
    public static void main(String[] args) {
        /*
         * 1. Multiplos de um numero
         * Leia um numero inteiro positivo n e apresente os 10 primeiros multiplos dele,
         * do primeiro ao decimo.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo: ");
        int numero = sc.nextInt();
        int multi = 0;

            System.out.print("\n ______________");
            System.out.print("\n|              |\n");
        for (int i = 1; i <= 10; i++){
            multi = numero * i;
            System.out.printf("| %02d X %02d = %02d |\n", numero, i, multi);
        }
        System.out.print("|______________|\n");

        sc.close();
    }
}
