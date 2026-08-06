import java.util.Scanner;

public class Exerc19 {
        /* 19. Quilômetros para metros
            Solicite ao usuário uma distância em quilômetros. Converta e mostre a distância em metros.

            Considere:

            1 quilômetro = 1000 metros

 */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double quilometro, metro;

        System.out.print("Digite uma distância em quilômetros: ");
        quilometro = scanner.nextDouble();

        metro = quilometro * 1000; 
        System.out.print(quilometro + " km = " + metro + " m" );
        
        
        scanner.close();

    }
}
