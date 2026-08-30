import java.util.Scanner;

public class Ex6SomaDeUmaSequenciaInformada {
    public static void main(String[] args) {
        
        /*
         * 6. Soma de uma sequência informada
         * Leia uma quantidade n de números que serão digitados pelo usuário. Em
         * seguida, leia exatamente n valores reais e apresente:
         * 
         * a soma de todos os valores;
         * a média dos valores informados.
         * O valor de n deve ser maior que zero.
         */

        Scanner entrada = new Scanner(System.in);

        int quantN = 0, contador = 0;

        float numRealInformado = 0, somaDetodosReaisInformados = 0, mediaDeTodosReaisInformados = 0;

        System.out.println("Escreva um numero inteiro: ");
        quantN = entrada.nextInt();
        System.out.println("");

        if (quantN > 0) {

            while (contador < quantN) {

                contador++;

                System.out.println("Escreva um numero real: ");
                numRealInformado = entrada.nextInt();

                somaDetodosReaisInformados += numRealInformado;

                mediaDeTodosReaisInformados = somaDetodosReaisInformados / quantN;

            }

            System.out.println("A soma dos " + quantN + " números reais informados é: " + somaDetodosReaisInformados);
            System.out.println("A média dos " + quantN + " números reais informados é: " + mediaDeTodosReaisInformados);
        
        } else {

            System.out.println("ERRO!\nO valor informado é invalido, tente um número maior que zero.");
        
        }

        entrada.close();
    }

}
