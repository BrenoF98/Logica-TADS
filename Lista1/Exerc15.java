import java.util.Scanner;

public class Exerc15 {

/* 15. Área de um círculo
Solicite ao usuário o raio de um círculo. Calcule e mostre sua área.

Utilize 3.14159 como valor de π.

Fórmula:

area = π × raio × raio
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double raio, area, pi = 3.14159; 

        System.out.print("Didite o raio do círculo ");
        raio = scanner.nextDouble();

        area = pi * raio * raio;

        System.out.println("A área do círculo é: " + area);

        scanner.close();

    }
}
