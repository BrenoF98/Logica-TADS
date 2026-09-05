import java.util.Scanner;

public class Ex7NumerosDentroDeUmaFaixa {

    /*
     * 7. Número dentro de uma faixa
     * Solicite um número inteiro entre 10 e 50, inclusive.
     * 
     * Enquanto o valor estiver fora dessa faixa, informe que o valor é inválido e
     * solicite uma nova entrada. Quando um valor válido for informado, apresente-o
     * na tela.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor Inteiro: ");
        int valor = entrada.nextInt();

        while (valor < 10 || valor > 50) {
            System.out.println("Valor invalido, tente novamente.");

            System.out.println("Informe um valor Inteiro: ");
            valor = entrada.nextInt();
        }

        System.out.println("Valor valido: " + valor);

        entrada.close();
    }
}
