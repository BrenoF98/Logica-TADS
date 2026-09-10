
import java.util.Random;
import java.util.Scanner;

public class GuessTheNum {
    public static void main(String[] args) {
        Scanner entrada = new  Scanner(System.in);
        Random aleatorio = new Random();
        final int N = aleatorio.nextInt(100) + 1;

        int valor = 0, tentativas = 0;

        //System.out.println(N);

        while (valor != N) {
        System.out.println("Informe um valor");

        valor = entrada.nextInt();

        tentativas++;

        System.out.println("Você tentou " + tentativas + " vezes!");

        if (tentativas >= 3) {
            if (valor > N) {
                System.out.println("Tente menor");
            } else if (valor < N) {
                System.out.println("Tente maior");
            }
        }

        }
        entrada.close();
    }
}