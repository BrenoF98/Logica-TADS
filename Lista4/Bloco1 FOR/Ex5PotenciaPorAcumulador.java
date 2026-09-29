import java.util.Scanner;

public class Ex5PotenciaPorAcumulador {
    public static void main(String[] args) {

        /*
         * 5. Potencia por multiplicacoes
         * Leia uma base real e um expoente inteiro nao negativo. Calcule a potencia
         * usando apenas multiplicacoes repetidas. Nao use Math.pow.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe um nuemro real (base):");
        float base = scanner.nextFloat();

        System.out.println("informe um nuemro inteiro não negativo (expoente): ");
        int expoente = scanner.nextInt();

        float resultado = 0;

        for (int i = 1; i < expoente; i++) {

            /* A potencia de um numero "a" plelo expoente "n" é a soma de n resultados da multiplicação da base por ela mesma, então: */
            resultado += base * base;
        }

        System.out.printf("%.0f^%d = %.0f", base, expoente, resultado);
        
        scanner.close();
    }
}
