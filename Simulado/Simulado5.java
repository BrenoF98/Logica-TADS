import java.util.Scanner;

public class Simulado5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numerador = 1, denominador = 1, soma = 1; 
        int n = 20; 

        for (int i = 1; i <= n; i++) {
            denominador *= i;

            System.out.println(numerador);
            System.out.println(denominador);
            System.out.println(soma);
            System.out.println();


            soma += numerador / denominador;

        }

        scanner.close();
    }
}
