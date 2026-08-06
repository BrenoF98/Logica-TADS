import java.util.Scanner;

public class Exerc18 {

    /* 18. Metros para centímetros e milímetros
            Solicite ao usuário uma medida em metros. Converta e mostre essa medida em:

            centímetros;
            milímetros.

            Considere:

            1 metro = 100 centímetros
            1 metro = 1000 milímetros

 */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double metro, centimetros, milimetros;
        System.out.print("Digite uma medida em m para ser convertida: ");
        metro = scanner.nextDouble();

        centimetros = metro * 100;
        milimetros = metro * 1000;

        System.out.print(metro + " m = " + centimetros + " cm = " + milimetros + " mm");
        
        scanner.close();

    }


}
