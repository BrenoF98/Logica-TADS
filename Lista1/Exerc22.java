import java.util.Scanner;

public class Exerc22 {


     /*22. Velocidade em metros por segundo
          Solicite ao usuário uma velocidade em milhas por hora. Converta e mostre a velocidade em metros por segundo.

          Fórmula:

          velocidadeEmMetrosPorSegundo = velocidadeEmQuilometrosPorHora ÷ 3.6
 */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double velocidadeQuilometrosH, velocidadeMetrosS;
        
        System.out.print("Escreva uma velocidade em km/h (quilometros por hora): ");
        velocidadeQuilometrosH = scanner.nextDouble();

        velocidadeMetrosS =  velocidadeQuilometrosH / 3.6;

        System.out.println(velocidadeQuilometrosH + " km/h = " + velocidadeMetrosS + " m/s");
        scanner.close();
    
        }
}
