import java.util.Scanner;

public class BugadoEx29AnaliseDosDigitosDeVariosNumeros {

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
                int guardaNumeroInformado, contadorDeDigitos = 0, soma = 0, resto = 0, digito, base = 1, par = 0,
                        impar = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
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

                    if (digito % 2 == 0) {
                        par++;
                    } else {
                        impar++;

                    }

                    if (contadorDeDigitos == guardaNumeroInformado) {
                        maior = digito;
                        menor = digito;

                    }

                    if (maior < digito) {
                        maior = digito;
                    }
                    if (menor > digito) {
                        menor = digito;
                    }

                }

                System.out.println("Soma dos digitos: " + soma);
                System.out.println("Quantidade de dígitos pares: " + par);
                System.out.println("Quantidade de dígitos ímpares: " + impar);
                System.out.println("Maior digito: " + maior);
                System.out.println("Menor digito: " + menor);

                System.out.println("Informe um número inteiro: ");
                numeroInformado = entrada.nextInt();

            }

        } else {
            System.err.println("Número Invalido!");
        }
        entrada.close();
    }
}
