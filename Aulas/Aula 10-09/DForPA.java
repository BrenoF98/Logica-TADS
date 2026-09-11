import java.util.Scanner;

public class DForPA {

    public static void main(String[] args) {

        /*
         * Soma dos 10 primeiros elementos de uma progressão aritimetica com inicio e
         * razão determinados pelo usuario
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o inicio e razão de uma P.A.: ");
        int inicioInformado = sc.nextInt();
        int razao = sc.nextInt();

        int inicio = inicioInformado;
        int soma = 0;

        System.out.println("\nPor for\n");


        for (int i = 0; i < 10; i++) {

            inicio = inicio + razao;
            soma = soma + inicio;

            System.out.println("Elementos da P.A.: " + inicio);

        }
        System.out.println("Soma da PA: " + soma);

        int i = 0;
        inicio = inicioInformado;
        soma = 0; 

        System.out.println("\nPor While\n");

        while (i < 10) {

            inicio = inicio + razao;
            soma = soma + inicio;

            i++;

            System.out.println("Elementos da P.A.: " + inicio);

        }
        System.out.println("Soma da PA: " + soma);


        sc.close();
    }
}