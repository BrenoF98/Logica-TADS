import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) throws Exception {
        /*
         * Dado dois valores inteiros, minutos e segundos. Faça um crometro decrescente.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois valores inteiros, sendo o primeiro minutos e o segundo segundos:  ");
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        while (minutos > 0 || segundos > 0) {
            if (segundos > 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                
                segundos--;
                System.out.printf("%02d:%02d", minutos, segundos);
                Thread.sleep(100);
            } else if (segundos == 0) {
                minutos--;
                segundos = 60;
            }
        }
        sc.close();
    }
}
