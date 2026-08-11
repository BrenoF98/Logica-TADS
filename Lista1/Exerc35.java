import java.util.Scanner;

public class Exerc35 {   
    /* 35. Distribuição de itens

            Solicite ao usuário:

            a quantidade total de itens;
            a quantidade de pessoas.
            Calcule e mostre:

            quantos itens cada pessoa receberá;
            quantos itens restarão sem distribuição.
            Considere que a quantidade de pessoas será maior que zero. */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int itens, pessoas, itemPessoa, resto;

        System.out.print("Informe a quantidade de itens: ");
        itens = scanner.nextInt();
        System.out.print("Informe a quantidade de pessoas: ");
        pessoas = scanner.nextInt();
        
        itemPessoa = itens / pessoas;
        resto = itens % pessoas;
        System.out.print("Há " + itemPessoa + " itens para cada pessoas e irá sobrar " + resto + " itens.");
        
        scanner.close();

    }
    
}
