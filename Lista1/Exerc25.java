import java.util.Scanner;
/* 25. Consumo médio de combustível
        Solicite ao usuário:

        a distância percorrida por um veículo, em quilômetros;
        a quantidade de combustível consumida, em litros.
        Calcule e mostre o consumo médio do veículo em quilômetros por litro.

        Fórmula:

        consumoMedio = distanciaPercorrida ÷ litrosConsumidos */

public class Exerc25 { public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 
        double distanciaPercorrida, quantCombustivel, consumoMedio;

        System.out.print("Informe a distância percorrida em quilômetros (km): ");
        distanciaPercorrida = scanner.nextDouble();
        
        System.out.print("Informe a quantidade de combustivel consumida em litros (L): ");
        quantCombustivel = scanner.nextDouble();
        
        consumoMedio = distanciaPercorrida / quantCombustivel;
        System.out.print("O comsumo médio foi (km/L): " + consumoMedio);

        
        scanner.close();
    }
    
}
