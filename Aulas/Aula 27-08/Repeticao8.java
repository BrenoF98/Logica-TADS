import java.util.Scanner;

public class Repeticao8 {
    // EX 8. FACA UM PROGRAMA QUE MOSTRE TODOS OS DIVISORES DE UM NUMERO

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // comece o contador em 0 e mostre até um valor n

        System.out.println("Informe um numero inteiro");
        int valorN = entrada.nextInt(), contador = 0, contadorDivisor = 0;
        System.out.println("");

        while (contador < valorN) {
            contador++;
            if (valorN % contador == 0) {
                contadorDivisor++;
                System.out.println( contador + " é divisor de " + valorN + "");
            }

        }
        System.out.println("");
        System.out.println("Número de divisores: " + contadorDivisor + "\n");
        

        if (contadorDivisor == 2) {
                
            System.out.println("O número " + valorN + " é primo!\n");        
        }

        entrada.close();

    }

}
