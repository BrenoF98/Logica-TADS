import java.util.Scanner;

public class Exerc26 {

/* 26. Custo de uma viagem
        Solicite ao usuário:

        a distância da viagem em quilômetros;
        o consumo médio do veículo em quilômetros por litro;
        o preço do litro do combustível.
        Calcule e mostre:

        a quantidade estimada de combustível necessária;
        o custo estimado da viagem. */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 
        double distanciaPercurso, consumoMedio, precoLitro, quantCombustivel, custoEstimado;

        System.out.print("Informe a distância a ser percorrida em quilômetros (km): ");
        distanciaPercurso = scanner.nextDouble();
        
        System.out.print("Informe o consumo médio do veliculo em litros (L): ");
        consumoMedio = scanner.nextDouble();
        
        System.out.print("Informe o valor do litro do combustivel: ");
        precoLitro = scanner.nextDouble();
        
        
        quantCombustivel = distanciaPercurso / consumoMedio;
        
        custoEstimado = quantCombustivel * precoLitro;
        
        System.out.print("A viagem irá consumir " + quantCombustivel + " L de combustivel.\nO preço estimado é R$ " + custoEstimado);


        
        scanner.close();
    }
    
}
