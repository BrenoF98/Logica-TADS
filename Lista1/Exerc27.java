import java.util.Scanner;

public class Exerc27 {

    /* 27. Tempo de viagem

            Solicite ao usuário:

            a distância de uma viagem em quilômetros;
            a velocidade média em quilômetros por hora.
            Calcule e mostre o tempo estimado da viagem em horas.

            Fórmula:

            tempo = distancia ÷ velocidade */

      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 
        double distanciaPercorrida, velocidadeMedia, temopoEstimado;

        System.out.print("Informa a distância percorrida em km: ");
        distanciaPercorrida = scanner.nextDouble();
        
        System.out.print("Informe a velocidade média em km/h: ");
        velocidadeMedia = scanner.nextDouble();
        
        
        temopoEstimado = distanciaPercorrida / velocidadeMedia;
        
        System.out.print("O tempo estimado em horas é" + temopoEstimado + " h.");


        scanner.close();
    }
}
