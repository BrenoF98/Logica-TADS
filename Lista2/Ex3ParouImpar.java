import java.util.Scanner;

public class Ex3ParouImpar {
/* Par ou ímpar

Leia um número inteiro e informe se ele é par ou ímpar.
*/
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero inteiro ");
        numero = entrada.nextInt();

        if (numero % 2 == 0){
            
            System.out.println("O número " + numero +" é par!");
        }else {
            System.out.println("O número " + numero + " é impar!");
        }

        entrada.close();
        
    }
    
}
