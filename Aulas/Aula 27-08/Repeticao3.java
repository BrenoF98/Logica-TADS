
import java.util.Scanner;

public class Repeticao3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // receba 2 (a e b) valores e vá de a para b
        System.out.println("Informe um numero inteiro");
        int valorA = entrada.nextInt(), valorB = entrada.nextInt();

        System.out.println("");

        if (valorA < valorB) {

            while (valorA <= valorB) {
                System.out.println(valorA);
                valorA++;
            }

        } else {

            while (valorA >= valorB) {
                System.out.println(valorA);
                valorA--;
            }
        }

    }

}
