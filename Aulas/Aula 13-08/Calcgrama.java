
import java.util.Scanner;


public class Calcgrama {    

    public static void main(String[] args) {

        // dado as dimenções de uma quada, largura e altura, calcular a área e o perimetro dessa quada. 
        // Supondo que quero preencher toda a quada com grama, e a grama é vendida em um tamanho quadrado NxN, com um valor por pedaço. 
        // quantos pedaços de grama é preciso comprar e qual o valor total? 


        Scanner sc = new Scanner(System.in);
        int altura, largura, area, perimetro;
        float ladoGrama, precoGrama, valortotal, quantidadeGrama, torrao;

        System.out.print("Escreva a altura e a largura da quadra em metros (m): ");
        altura = sc.nextInt();
        largura = sc.nextInt();

        System.out.print("Informe o compimento do torrao do pedaço de grama e o preço por pedaço: ");
        ladoGrama = sc.nextFloat();
        precoGrama = sc.nextFloat();

        area = largura * altura;
        torrao = ladoGrama*ladoGrama;
        perimetro = (largura + altura ) *2;
        quantidadeGrama = area / torrao;
        valortotal = precoGrama * quantidadeGrama;

        System.out.println("A area da quadra é: " + area + " m². \nA perimetro da quadra é: " + perimetro +  " m." );
        System.out.println("Será necessario " + quantidadeGrama + " pedaços de grama. \nO valor total para a compra é: R$ " + valortotal);


        sc.close();
        
    }
}
