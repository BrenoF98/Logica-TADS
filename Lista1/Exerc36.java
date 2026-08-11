import java.util.Scanner;

public class Exerc36 {    
    /* 36. Decomposição de um valor em cédulas
            Solicite ao usuário um valor inteiro em reais. Calcule quantas cédulas de cada valor seriam necessárias para representar o valor informado.

            Utilize cédulas de:

            R$ 100
            R$ 50
            R$ 20
            R$ 10
            R$ 5
            R$ 2
            R$ 1
            Exemplo:

            Valor informado: R$ 187

            Cédulas de R$ 100: 1
            Cédulas de R$ 50: 1
            Cédulas de R$ 20: 1
            Cédulas de R$ 10: 1
            Cédulas de R$ 5: 1
            Cédulas de R$ 2: 1
            Cédulas de R$ 1: 0
            Resolva utilizando somente divisões inteiras e o operador de resto da divisão.
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor, valor100, resto100, valor50, resto50, valor20, resto20, 
        valor10, resto10, valor5, resto5, valor2, resto2,valor1;

        System.out.print("Informe o valor total em reais: ");
        valor = scanner.nextInt();

        valor100 = valor / 100;
        resto100 = valor % 100;
        valor50 = (resto100) / 50;
        resto50 = (resto100) % 50;
        valor20 = (resto50) / 20;
        resto20 = (resto50) % 20;
        valor10 = (resto20) / 10;
        resto10 = (resto20) % 10;
        valor5 = (resto10) / 5;
        resto5 = (resto10) % 5;
        valor2 = (resto5) / 2;
        resto2 = (resto5) % 2;
        valor1 = (resto2) / 1;

        System.out.println("Cédulas de R$ 100: " + valor100);
        System.out.println("Cédulas de R$ 50: " + valor50);
        System.out.println("Cédulas de R$ 20: " + valor20);
        System.out.println("Cédulas de R$ 10: " + valor10);
        System.out.println("Cédulas de R$ 5: " + valor5);
        System.out.println("Cédulas de R$ 2: " + valor2);
        System.out.println("Cédulas de R$ 1: " + valor1);
        

        scanner.close();

    }
    
}
