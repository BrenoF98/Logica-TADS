import java.util.Scanner;

public class SeriePI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double denominador = 1, numerador = 4, PI = 0, quociente = 4;
        int nFator = 10000000;
        for (int i = 1; i <= nFator; i++) {
            if (i % 2 == 0) {
                quociente = (quociente) * (-1);
            }

            PI += quociente;
            denominador += 2;
            quociente = numerador / denominador;
            System.out.println(i + " -> " + PI);
        }

        scanner.close();
    }
}
