
import java.util.Scanner;

public class Ex38 {
    /*38. Seguro de veículo
Leia:

idade do motorista;
quantidade de anos de habilitação;
valor base do seguro.
Regras:

motorista com menos de 21 anos: acréscimo de 20%;
de 21 a 25 anos: acréscimo de 10%;
acima de 25 anos: sem acréscimo por idade. ok
Além disso, se tiver menos de 2 anos de habilitação, acrescente mais 15% sobre o valor base. 

Mostre cada acréscimo separadamente e o valor final. Idade e tempo de habilitação não podem ser negativos, e o tempo de habilitação não pode ser maior que a idade.

 */
    public static void main(String[] args) {

        int idade, tempHabilit;
        float valorBase, valorFinal, desconto, valorComDescontoIdade, valorComDescontoHabilit;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: " );
        idade = entrada.nextInt();
        System.out.println("Informe o tempo que tem habilitação: " );
        tempHabilit = entrada.nextInt();

        System.out.println("Informe o valor vabe do seguro: ");
        valorBase = entrada.nextFloat();

        if ( idade > 0 && tempHabilit > 0 && tempHabilit < idade && valorBase > 0) {
            if (idade >= 25) {
                if (tempHabilit < 2) {
                    System.out.println();   
                } else {
                    System.out.println("Não há acressimo! \nO valor a ser pago é: " + valorBase);
                }
 
            } else if(idade >= 21){
                System.out.println();

            }
                
            }
        } else {

            System.out.println("Um ou mais valores não são validos! ");
        }
    }
}

