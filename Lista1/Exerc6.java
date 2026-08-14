import java.util.Scanner;

public class Exerc6 {

    /* 
        6. Inversão de dois algarismos
            Solicite ao usuário um número inteiro positivo de dois algarismos. Calcule e mostre o número com os algarismos invertidos.

            Exemplo:

            Número informado: 42
            Número invertido: 24
    */
    public static void main(String[] args) {
        int numero, algarismo1, algarismo2, numeroInvertido;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo de dois algarismos: ");
        numero = scanner.nextInt();

        algarismo1 = numero / 10;
        algarismo2 = numero % 10;
        numeroInvertido = (algarismo2 * 10) + algarismo1;

        System.out.println("Algarismo 1: " + algarismo1);
        System.out.println("Algarismo 2: " + algarismo2);
        System.out.println("Número invertido: " + numeroInvertido);

        scanner.close();
    }
}