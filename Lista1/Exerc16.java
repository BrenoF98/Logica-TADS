import java.util.Scanner;

public class Exerc16 {
    
    /* 16. Comprimento de uma circunferência
        Solicite ao usuário o raio de uma circunferência. Calcule e mostre seu comprimento.

        Utilize 3.14159 como valor de π.

        Fórmula:

        comprimento = 2 × π × raio */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double raio, comprimentoCirc;
        double pi = 3.14159;

        System.out.print("Digite o raio do círculo: ");
        raio = scanner.nextDouble();

        comprimentoCirc = 2 * pi * raio;

        System.out.println("A circunferência do circulo de raio " + raio + " é: " + comprimentoCirc);

        scanner.close();

    }
    
}
