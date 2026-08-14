
import java.util.Scanner;

public class quebrando {

    /* FAÇA UM INVERSOR DE 4 DIGITOS

        1234 -> 4321
        UTILIZANDO OPERACOES MATEMATICAS */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, milhar, centena, dezena, resto, valorinvertido;

        System.out.print("Escreva um numero inteiro de 4 digitos: ");
        valor = sc.nextInt();

        milhar = valor / 1000;
        resto = valor % 1000;
        centena = resto / 100; 
        resto = resto % 100;
        dezena = resto / 10;
        resto = resto % 10;
        
        valorinvertido = (resto * 1000) + (dezena * 100) + (centena * 10) + milhar;
        
        System.out.println("O número digitado foi: " + valor);
        System.out.println("O numero invertido é: " + valorinvertido);


        
        sc.close();
    }
    
}
