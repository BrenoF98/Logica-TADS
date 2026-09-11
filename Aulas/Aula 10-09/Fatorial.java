import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroN = sc.nextInt();
        int fatorial = 1;

        for (int i = numeroN; i >= 1; i--) {

            System.out.println(fatorial);
            fatorial = fatorial * i;

        }
        System.out.printf("%d! =  %d%n", numeroN, fatorial);
    }
}
