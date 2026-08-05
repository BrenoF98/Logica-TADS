import java.util.Scanner; // Importa a classe Scanner do pacote java.util para permitir a leitura de entrada do usuário

public class Exerc1 {

    /* 
    
    1. Antecessor e sucessor
        Solicite ao usuário um número inteiro. Calcule e mostre:

        o número antecessor;
        o número informado;
        o número sucessor.
    
    */

    public static void main(String[] args) { 

        int numero = 0; // inicializa a variável numero com o valor 0

        System.out.print("Digite um número inteiro: "); // solicita ao usuário que digite um número inteiro

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        numero = scanner.nextInt(); // lê o número digitado pelo usuário e armazena na variável numero
        
        System.out.println("O número anterior é: " + (numero - 1)); // imprime o número anterior ao digitado pelo usuário
        System.out.println("O número digitado foi: " + numero); // imprime o número digitado pelo usuário
        System.out.println("O número posterior é: " + (numero + 1)); // imprime o número posterior ao digitado pelo usuário

        scanner.close(); // Fechar o scanner para liberar recursos
    }
}
