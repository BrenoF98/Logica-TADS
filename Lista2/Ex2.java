import java.util.Scanner;

public class Ex2 {

        /* Maior de idade
    
    Leia a idade de uma pessoa e informe se ela é maior de idade (idade >= 18) ou menor de idade.

*/

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.print("Qual a sua idade? ");
        idade = entrada.nextInt();

        if (idade >= 18){
            
            System.out.println("Você é maior de idade!");
        }else {
            System.out.println("Você é menor de idade!");
        }

        entrada.close();
        
    }
    
}
