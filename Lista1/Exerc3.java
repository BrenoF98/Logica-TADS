import java.util.Scanner; // Importa a classe Scanner do pacote java.util para permitir a leitura de entrada do usuário

public class Exerc3 {

    /*
     * 3. Quatro operações
     * 
     * Solicite ao usuário dois números reais. Calcule e mostre:
     * 
     * a soma;
     * a subtração do primeiro pelo segundo;
     * a multiplicação;
     * a divisão do primeiro pelo segundo.
     * 
     * Considere que o segundo número sempre será diferente de zero.
     */

    public static void main(String[] args) {

        // declara duas variáveis do tipo double para armazenar os números digitados
        // pelo usuário

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: "); // solicita ao usuário que digite o primeiro número real
        double numero1 = scanner.nextDouble(); // lê o primeiro número digitado pelo usuário e

        System.out.print("Digite o segundo número real diferente de zero: "); // solicita ao usuário que digite o
                                                                              // segundo número real diferente de zero
        double numero2 = scanner.nextDouble(); // lê o segundo número digitado pelo usuário e

        // Calcula e mostra os resultados
        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração (primeiro - segundo): " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));
        System.out.println("Divisão (primeiro / segundo): " + (numero1 / numero2));

        scanner.close();

    }
}
