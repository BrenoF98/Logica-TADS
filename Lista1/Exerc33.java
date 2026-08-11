import java.util.Scanner;

public class Exerc33 {

    /* 33. Conversão de dias
            Solicite ao usuário uma quantidade inteira de dias. Calcule e mostre:

            a quantidade de semanas completas;
            a quantidade de dias restantes.
            Considere que uma semana possui sete dias. */

       public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dias, semadas, diasRest;

        System.out.print("Informe uma quatidade interira de dias: ");
        dias = scanner.nextInt();

        semadas = dias / 7;
        diasRest = dias % 7;

        System.out.println("Dias informados: " + dias);
        System.out.println("Semenas completas: " + semadas);
        System.out.println("Dias restantes: " + diasRest);


        scanner.close();

    }

}
