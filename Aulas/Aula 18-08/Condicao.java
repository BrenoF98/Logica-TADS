import java.util.Scanner;
public class Condicao {
    public static void main(String[] args) {
        
        /* Existe cenarios que precisamos executar, ou não, determinado trexo do codigo. */

        // Verifcar se uma pessoa pode comrpar bebida dada sua idade (+18)

        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        /*  a estrutura de condição é sempore 
        
        if(condição){
            // código a ser executado se a condição for verdadeira
        } else {
            // código a ser executado se a condição for falsa
        }
        */

        if(idade >= 18){
            System.out.println("Pode comprar bebida alcoolica!");
        } 
        if(idade < 18){
            System.out.println("Apenas pode comprar bebida não alcoolica!");
        }

        entrada.close();


    }
}
