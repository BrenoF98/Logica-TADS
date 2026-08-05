import java.util.Scanner;

public class Exerc5 {

    /*  5. Soma dos algarismos
            Solicite ao usuário um número inteiro positivo de três algarismos.

            Calcule e mostre a soma dos três algarismos.

            Exemplo:

            Número informado: 527
            Soma dos algarismos: 14
            Utilize divisão inteira e o operador de resto da divisão %. */

    public static void main(String[] args) {
        int numero, soma, algarismo1, algarismo2, algarismo3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo de três algarismos: ");
        numero = scanner.nextInt();

        algarismo1 = numero / 100;
        System.out.println("Algarismo 1: " + algarismo1);
        algarismo2 = (numero % 100) / 10;
        System.out.println("Algarismo 2: " + algarismo2);
        algarismo3 = numero % 10;
        System.out.println("Algarismo 3: " + algarismo3);

        soma = algarismo1 + algarismo2 + algarismo3;

        System.out.println("Soma dos algarismos: " + soma);

        scanner.close();
    }
}