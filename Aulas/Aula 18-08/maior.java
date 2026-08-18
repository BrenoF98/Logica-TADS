import java.util.Scanner;

public class maior {
    // programa que mosta qual o maior entre dois numeros, caso sejam igual mostra
    // que são iguais.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois numeros para saber qual é o maior: ");
        int a, b;
        a = entrada.nextInt();
        b = entrada.nextInt();

        /*
         * if (a > b) {
         * System.out.println("O maior é: " + a);
         * }
         * if (b > a) {
         * System.out.println("O maior é: " + b);
         * }
         * if (a == b) {
         * System.out.println("Os numeros são iguais!");
         * }
         */

        // não é necessario usar if para cada condição, podemos usar else if e else para
        // simplificar o código.
        if (a > b) { //(se)
            System.out.println("O maior é: " + a);
        } else if (b > a) { // else if (senão se)é usado para verificar uma condição caso a primeira seja falsa.
            System.out.println("O maior é: " + b);
        } else { // else (senão)é usado para executar um bloco de código caso todas as condições
                 // anteriores sejam falsas.
            System.out.println("Os numeros são iguais!");
        }

        // EM NENHUMA LINGUAGEM EXISTE UM ELSE QUE NÃO SEJA APOS UM IF, POIS O ELSE É
        // USADO PARA EXECUTAR UM BLOCO DE CÓDIGO CASO A CONDIÇÃO DO IF SEJA FALSA.

        // quando o meu bloco contei APENAS uma instrução OU um unico bloco de código, 
        // não é necessario usar chaves, mas é uma boa prática de programação sempre 
        // usar chaves para delimitar o bloco de código.
        entrada.close();
    }

}
