import java.util.Scanner; // Importa a classe Scanner do pacote java.util para permitir a leitura de entrada do usuário

public class Exerc1 {

    /*
     * 
     * 1. Antecessor e sucessor
     * Solicite ao usuário um número inteiro. Calcule e mostre:
     * 
     * o número antecessor;
     * o número informado;
     * o número sucessor.
     * 
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, anterior, posterior; // inicializa a variável numero com o valor 0

        System.out.print("Digite um número inteiro: "); // solicita ao usuário que digite um número inteiro
        numero = scanner.nextInt(); // lê o número digitado pelo usuário e armazena na variável numero

        anterior = numero - 1;
        posterior = numero + 2;

        System.out.println("O anteiro é: " + anterior);
        System.out.println("O número foi: " + numero);
        System.out.println("O posterior é: " + posterior);

        scanner.close(); // Fechar o scanner para liberar recursos
    }
}
