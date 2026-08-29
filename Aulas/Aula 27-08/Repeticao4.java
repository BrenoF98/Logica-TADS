
import java.util.Scanner;

public class Repeticao4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*receba 10 valores do usuario (dentro do while) e conte quantos são maiores ou igual a 7 */

        int contador = 1, quantidadeValores = 0;

        while (contador <= 10) {
            contador++;

            System.out.println("Informe um valor inteiro");
            int valorInformado = entrada.nextInt();

            if (valorInformado >= 7) {
                quantidadeValores++;
                
            }
        }

        System.out.println(quantidadeValores + " números são maior ou igual a 7");
        entrada.close();
    }
}
