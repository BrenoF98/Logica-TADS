import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*
         * 5. Soma dos termos aceitos
         * Leia 15 números reais.
         * Ignore os valores menores que zero. Interrompa se for informado o valor 1000.
         * Apresente a soma, a quantidade aceita e a maior entrada aceita.
         */

        Scanner sc = new Scanner(System.in);

        int quantidade = 15; // define numero de tentativas.

        int contValorRealAceito = 0;
        float valorReal, soma = 0, maior = Float.MIN_VALUE;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe um valor real com até duas casas decimais: "); // a indicação das casas evita que
                                                                                     // valores menores que 2 casas
                                                                                     // decmais fiquem ocultos no
                                                                                     // relatorio final.
            valorReal = sc.nextFloat();

            if (valorReal < 0) // ignora o bloco a baixo indo direto para iteração de i.
                continue;

            if (valorReal == 1000) // finaliza o laço.
                break;

            if (maior < valorReal) { // verifica o maior.
                maior = valorReal;
            }

            soma += valorReal; // soma os valores aceitos.
            contValorRealAceito++; // conta quandos valores foram aceitos.
        }

        System.out.printf("""

                        Relatorio Final:

                SOMA:...................-> %.2f
                QUANTIDADE ACEITA:......-> %d
                MAIOR ENTRADA ACEIRA:...-> %.2f

                       """, soma, contValorRealAceito, maior);

        sc.close();

    }
}
