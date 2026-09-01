import java.util.Scanner;

public class Ex16MaiorEMenorValor {

    /*
     * 16. Maior e menor valor
     * Leia uma quantidade n de números inteiros, sendo n > 0.
     * 
     * Informe ao final:
     * 
     * o maior número digitado;
     * o menor número digitado;
     * a diferença entre o maior e o menor número.
     * Não assuma previamente que os números serão positivos.
     * 
     * 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantN = 1, contador = 0, numeroInformado = 0, maior = 0, menor = 0, diferenca = 0;

        boolean iguais = false;

        System.out.println("Informe a quantidade de números: ");
        quantN = entrada.nextInt();
        if (quantN > 0) {
            while (contador < quantN) {
                contador++;

                System.out.println("Informe um número: ");
                numeroInformado = entrada.nextInt();
                if (contador == 1) {
                    maior = numeroInformado;
                    menor = numeroInformado;
                }

                if (numeroInformado > maior) {
                    maior = numeroInformado;
                }
                if (numeroInformado < menor) {
                    menor = numeroInformado;
                }

            }

            if (maior == menor) {
                iguais = true;

            }
            if (iguais) {
                System.out.println("Os numeros são iguais!");
            } else {
                diferenca = maior - menor;
                System.out.println("maior " + maior);
                System.out.println("menor " + menor);
                System.out.println("");
                System.out.println(maior + " - " + menor + " = " + diferenca);

            }

        } else {
            System.out.println("Valor invalido!");
        }

        entrada.close();

    }
}
