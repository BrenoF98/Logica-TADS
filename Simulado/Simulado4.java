
import java.util.Scanner;

public class Simulado4 {
    public static void main(String[] args) {
        /*
         * Faça um programa que calcule o Máximo Divisor Comum (MDC) e o Mínimo Múltiplo
         * Comum (MMC) entre 3 números digitados pelo usuario
         */

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int menor;
        int mdc;
        int maior;
        int mmc;


        do {

            System.out.println("Informe 3 números positivos (ou 0 para sair): ");
            num1 = sc.nextInt();
            
            if (num1 == 0) {
                break;
            }
            
            num2 = sc.nextInt();
            num3 = sc.nextInt();

            // define o menor para o calculo do MDC.
            menor = num1;
            if (num2 < menor) {
                menor = num2;
            }
            if (num3 < menor) {
                menor = num3;
            }

            // Calcula o MDC
            mdc = 1; // maximo divisor comum nunca será menor que 1. 
            for (int i = 1; i <= menor; i++) {
                if (num1 % i == 0 && num2 % i == 0 && num3 % i == 0) {
                    mdc = i; // Guarda o maior divisor comum encontrado
                }
            }

            // define o maior para o calculo do MMC

            maior = num1;
            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }

            // teste os valores a partir do maior para encontrar o MMC
            mmc = maior; // o minimo multiplo comum, nunca será menor que o mairo elemento testado. 
            while (true) {
                if (mmc % num1 == 0 && mmc % num2 == 0 && mmc % num3 == 0) {
                    break; // Encontrou o menor número divisível pelos três
                }
                mmc++;
            }

            System.out.printf("MDC de %d, %d, %d = %d\n", num1, num2, num3, mdc);
            System.out.printf("MMC de %d, %d, %d = %d\n\n", num1, num2, num3, mmc);

        } while (num1 != 0);
        sc.close();
    }
}
