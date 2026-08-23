
import java.util.Scanner;

public class Ex13MaiorEntre3aula {
    public static void main(String[] args) {





        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3; 

        System.out.println("Escreva 3 números inteiros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
     /* cuidar logica de || e &&  muda completamente*/
        if (num1 != num2 || num1 != num3){
            if (num1 >= num2 && num1 >= num3){

                System.out.println("O número " + num1 + " é o maior!");

            }else if (num2 >= num3){
                
                System.out.println("O número " + num2 + " é o maior!");

            }else {

                System.out.println("O número " + num3 + " é o maior!");
            }
            }else { 
                System.out.println("Os números são igua!");

            }
            
            entrada.close();
        }

    }
