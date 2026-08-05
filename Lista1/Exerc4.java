import java.util.Scanner;

public class Exerc4 {

    /*
     * 4. Quadrado e cubo
     * 
     * Solicite ao usuário um número inteiro. Calcule e mostre:
     * 
     * o número elevado ao quadrado;
     * o número elevado ao cubo.
     * 
     * Para manter o exercício dentro do conteúdo estudado, realize os cálculos utilizando multiplicações
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int quadrado = numero * numero;
        int cubo = numero * numero * numero;

        System.out.println("O número digitado elevado ao quadrado é: " + quadrado);
        System.out.println("O número digitado elevado ao cubo é: " + cubo);

        scanner.close();
        
    }
}