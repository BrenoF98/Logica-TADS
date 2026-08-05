import java.util.Scanner; // Importa a classe Scanner do pacote java.util para permitir a leitura de entrada do usuário

public class Exerc2 {

    /*
     * 
     * 2. Dobro, triplo e metade
     * 
     * Solicite ao usuário um número real. Calcule e mostre:
     * 
     * o dobro do número;
     * o triplo do número;
     * a metade do número.
     */

    public static void main(String[] args) {

        double numero; // declara uma variável do tipo double para armazenar o número digitado pelo
                       // usuário

        Scanner scanner = new Scanner(System.in); // cria um objeto Scanner para ler a entrada do usuário

        System.out.print("Digite um número real: "); // solicita ao usuário que digite um número real

        numero = scanner.nextDouble(); // lê o número digitado pelo usuário e armazena na variável numero

        System.out.println("Dobro do número digitado: " + numero * 2); // imprime o número digitado pelo usuário
        System.out.println("Triplo do número digitado: " + numero * 3); // imprime o número digitado pelo usuário
        System.out.println("Metade do número digitado: " + numero / 2); // imprime o número digitado pelo usuário

        scanner.close(); // Fechar o scanner para liberar recursos
    }
}
