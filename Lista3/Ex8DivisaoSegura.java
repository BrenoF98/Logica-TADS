import java.util.Scanner;

public class Ex8DivisaoSegura {

    /*
     * 8. Divisão segura
     * Leia um número real a. Depois, solicite um segundo número real b.
     * 
     * Enquanto b for igual a zero, informe que o divisor é inválido e solicite
     * novamente apenas o segundo número.
     * 
     * Quando um divisor válido for informado, apresente o resultado de a / b.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float numRealA, numRealB, quociente;

        System.out.println("Informe um numero real: (dividendo)");
        numRealA = entrada.nextFloat();

        System.out.println("Informe um numero real: (divisor)");
        numRealB = entrada.nextFloat();

        while (numRealB == 0) {

            System.out.println("\nO divisor é INVALIDO\n");

            System.out.println("Informe um numero real: (divisor)");
            numRealB = entrada.nextFloat();

        }

        quociente = numRealA / numRealB;

        System.out.printf("%.2f / %.2f = %.2f\n", numRealA, numRealB, quociente);
        
        entrada.close();
    }
}
