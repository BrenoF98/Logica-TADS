
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 8. Triângulo alinhado a direita
         * Leia a altura n e desenhe um triângulo reto alinhado a direita, usando
         * espaços antes dos asteriscos.
         */

        System.out.print("Informe uma altura n: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) { // percorre linhas.
            for (int j = 0; j < altura; j++) { // percore colulas.
                if (j > altura - i - 1) { // imprime espaço seguido de asterisco sempre que a coluna for maior que o
                                          // valor atribuido a altura - a linha - 1 para compensar o espaço.

                    System.out.print(" *"); 
                } else {
                    System.out.print("  "); // imprime espaço para todos os outros valores de j. 
                }
            }

            System.out.println(); // inicia uma nova linha. 
        }
        sc.close();
    }
}
