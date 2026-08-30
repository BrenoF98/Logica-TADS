import java.util.Scanner;

public class Ex1ContagemProgressiva {

    public static void main(String[] args) {
        // entrada

        int numero;

        // processamento
        int numeroContado = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva um numero inteiro: ");
        numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("Contagem:");
            System.out.println("");
            while (numeroContado < numero) {
                numeroContado++;
                System.out.println(numeroContado);
            }
        } else {
            System.out.println("Valor invalido!");
        }
        entrada.close();
    }

}
