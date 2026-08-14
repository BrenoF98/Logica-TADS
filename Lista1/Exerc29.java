import java.util.Scanner;

public class Exerc29 {

    /* 29. Compra de combustível
            Solicite ao usuário:

            o preço do litro do combustível;
            o valor que será utilizado para abastecer.
            Calcule e mostre quantos litros de combustível poderão ser comprados. */

  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in); 

    double precoLitro, dinheiroDisponivel, litros;

    System.out.print("Qual o preço do litro do combustivel? ");
    precoLitro = scanner.nextDouble();

    System.out.print("Qual o valor disponivel para realizar o abastecimento? ");
    dinheiroDisponivel = scanner.nextDouble();

    litros = dinheiroDisponivel / precoLitro;
    System.out.print("Será possivel abastecer " + litros + " L de combustível");


    scanner.close();
    }
    
}
