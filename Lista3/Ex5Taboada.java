import java.util.Scanner;

public class Ex5Taboada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroN = 0, contador = 0, numeroNMult = 0;

        System.out.println("Escreva um numero inteiro: ");
        numeroN = entrada.nextInt();
        System.out.println("");

        while (contador < 10) {
            contador++;
            numeroNMult = contador * numeroN;

            System.out.println(numeroN + " x " + contador + " = " + numeroNMult);

        }
        entrada.close();
    }

}
