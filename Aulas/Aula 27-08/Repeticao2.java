import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        // comece o contador em 0 e mostre até um valor n
        System.out.println("Informe um numero inteiro");
        int valorN = entrada.nextInt(), contador = 0;

        while (contador <= valorN) {
           
            System.out.println(contador);
            
            contador++;
        }
        

    }
}
