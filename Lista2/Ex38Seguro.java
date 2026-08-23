
import java.util.Scanner;

public class Ex38Seguro {
    /*
     * 38. Seguro de veículo
     * Leia:
     * 
     * idade do motorista;
     * quantidade de anos de habilitação;
     * valor base do seguro.
     * Regras:
     * 
     * motorista com menos de 21 anos: acréscimo de 20%;
     * de 21 a 25 anos: acréscimo de 10%;
     * acima de 25 anos: sem acréscimo por idade.
     * Além disso, se tiver menos de 2 anos de habilitação, acrescente mais 15%
     * sobre o valor base.
     * 
     * Mostre cada acréscimo separadamente e o valor final. Idade e tempo de
     * habilitação não podem ser negativos, e o tempo de habilitação não pode ser
     * maior que a idade.
     * 
     */
    public static void main(String[] args) {

        float valorBase, valorFinal, acresIdade, acresTempHabilit, percentualIdade, percentualTempHabilit, idade, tempHabilit;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade: (considere 18 anos e 6 mêses como 18,5 anos) ");
        idade = entrada.nextFloat();

        if (idade >= 18.5) {

            System.out.println("Informe o tempo que tem habilitação: ");
            tempHabilit = entrada.nextFloat();

            if (tempHabilit < (idade - 18.5)) { // considerando 5 meses minimos para fazer a carteira.

                System.out.println("Informe o valor base do seguro: ");
                valorBase = entrada.nextFloat();
                System.out.println("");
                if (valorBase > 0) {

                    if (tempHabilit < 2) {
                        percentualTempHabilit = 15;
                    } else {
                        percentualTempHabilit = 0;
                    }
                    if (idade < 21) {
                        percentualIdade = 20;

                    } else if (idade < 25) {
                        percentualIdade = 10;

                    } else {
                        percentualIdade = 0;

                    }

                    acresTempHabilit = valorBase * (percentualTempHabilit / 100);
                    acresIdade = valorBase * (percentualIdade / 100);
                    valorFinal = valorBase + acresIdade + acresTempHabilit;
                    System.out.println("Acrescimo pela idade: " + acresIdade+ "\n");
                    System.out.println("Acrescimo por tempo de habilitação: " + acresTempHabilit+ "\n");
                    System.out.println("O valor final é: " + valorFinal+ "\n");
                } else {
                    System.out.println("Valor base invalido!"+ "\n");
                }
            } else {
                System.out.println("Tempo de habilitação invalido!"+ "\n");
            }

        } else {
            System.out.println("Idade invalida!"+ "\n");
        }
        entrada.close();
    }

}
