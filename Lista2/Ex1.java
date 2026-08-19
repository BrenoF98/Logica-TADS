import java.util.Scanner;

public class Ex1 {
    /* Positivo ou negativo
    
    Leia um número inteiro e informe se ele é positivo ou negativo. Considere o zero como positivo.

*/

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Escreva um numero inteiro: ");
        numero = entrada.nextInt();

        if (numero >= 0){
            
            System.out.println("O número: " + numero + " é positivo!");
        }else {
            System.out.println("O número: " + numero + " é positivo!");
        }


        entrada.close();
        
    }

    
}
