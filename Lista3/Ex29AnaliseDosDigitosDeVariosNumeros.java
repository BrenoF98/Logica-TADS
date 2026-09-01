import java.util.Scanner;

public class Ex29AnaliseDosDigitosDeVariosNumeros {

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

        System.out.println("Informe um número inteiro: ");
        numeroInformado = entrada.nextInt();

        if (numeroInformado >= 0) {
            while (numeroInformado != 0) {
                int guardaNumeroInformado, contadorDeDigitos = 0, soma = 0, resto = 0, digito, base = 1;
                guardaNumeroInformado = numeroInformado;
                System.out.println("Número Informado: " + numeroInformado);

                while (numeroInformado > 0) { // conta quantos digitos tem.

                    if (contadorDeDigitos > 0) {
                        base *= 10;
                    }

                    numeroInformado = numeroInformado / 10;
                    contadorDeDigitos++;

                }
                System.out.println("Quantidade de digitos: " + contadorDeDigitos);

                while (contadorDeDigitos > 0 && base > 0) {
                    if (resto == 0) {
                        digito = guardaNumeroInformado / base;
                    } else {
                        digito = resto / base;

                    }
                    resto = guardaNumeroInformado % base;
                    soma += digito;
                    base /= 10;

                }
                System.out.println("Soma dos digitos: " + soma);

                System.out.println("Informe um número inteiro: ");
                numeroInformado = entrada.nextInt();

            }

        } else {
            System.err.println("Número Invalido!");
        }
    }
}
