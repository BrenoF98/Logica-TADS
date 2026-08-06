import java.util.Scanner;

public class Exerc20 {

     /*    20. Celsius para Fahrenheit
                Solicite ao usuário uma temperatura em graus Celsius. Converta e mostre a temperatura em graus Fahrenheit.

                Fórmula:

                fahrenheit = celsius × 9 ÷ 5 + 32
                Utilize números reais no cálculo para evitar problemas com a divisão inteira.
 */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double celsius, kelvin, fahrenheit;

        System.out.print("Digite uma temperatura em °C (Graus Celsius): ");
        celsius = scanner.nextDouble();

        kelvin = celsius + 273.15;
        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " °C = " + fahrenheit + " °F = " + kelvin + " K");
        
        
        scanner.close();
    }
    
}
