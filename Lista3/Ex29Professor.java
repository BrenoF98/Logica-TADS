import java.util.Scanner;

public class Ex29Professor {

    /*
     * 29. Análise dos dígitos de vários números
     * Leia números inteiros positivos até que seja informado 0.
     * 
     * Para cada número, utilize operações de divisão inteira e resto (/ e %)
     * juntamente com while para analisar seus dígitos individualmente.
     * 
     * Para cada número, apresente:
     * 
     * quantidade de dígitos;
     * soma dos dígitos;
     * quantidade de dígitos pares;
     * quantidade de dígitos ímpares;
     * maior dígito encontrado.
     * Exemplo: para 5728, a soma dos dígitos é 22 e o maior dígito é 8.
     * 
     * Ao finalizar todas as entradas, informe também quantos números foram
     * analisados.
     * 
     * Restrição: não transforme o número em String para resolver o exercício.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroInformado;

        System.out.println("Informe um número inteiro: (até 10 digitos)");
        numeroInformado = entrada.nextInt();

        if (numeroInformado >= 0) {

            while (numeroInformado != 0) {

                int auxiliar, contadorDeDigitos = 0, somaDigitos = 0,  pares = 0,
                        impares = 0, maiorDigito = Integer.MIN_VALUE;

                auxiliar = numeroInformado;

                System.out.println("Número Informado: " + numeroInformado);

               while (auxiliar > 0) {
                int digito = auxiliar % 10;

                contadorDeDigitos++;
                somaDigitos = somaDigitos+digito;

                if (digito % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if (digito > maiorDigito) {
                    maiorDigito = digito;
                }

                auxiliar = auxiliar / 10;
            }

                System.out.println("Quantidade de digitos: " + contadorDeDigitos);
                System.out.println("Soma dos digitos: " + somaDigitos);
                System.out.println("Quantidade de dígitos pares: " + pares);
                System.out.println("Quantidade de dígitos ímpares: " + impares);
                System.out.println("Maior digito: " + maiorDigito);

                System.out.println("Informe um número inteiro: ");
                numeroInformado = entrada.nextInt();

            }

        } else {
            System.err.println("Número Invalido!");
        }
        
        entrada.close();
    }
}
