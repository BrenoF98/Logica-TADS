import java.util.Scanner;

public class Ex8MultiploDe5 {

    /* 8. Número múltiplo de 5
Leia um número inteiro e informe se ele é ou não múltiplo de 5.

*/
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Escreva um número inteiro: ");

        numero = entrada.nextInt();

        if (numero % 5 == 0) {
            System.out.println("O núemro " +numero+ " é multiplo de 5");
        } else { 
            System.out.println("O núemro " +numero+ " não é multiplo de 5");
        }
        entrada.close();
    }
}
