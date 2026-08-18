import java.util.Scanner;

public class Condicao2 {

    public static void main(String[] args) {

        int numero;
        Scanner entrada = new Scanner(System.in);

        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        }
        if (numero % 3 == 0) {
            System.out.println("o numero é divisivel por 6!");
        }


        entrada.close();
        
    }
}