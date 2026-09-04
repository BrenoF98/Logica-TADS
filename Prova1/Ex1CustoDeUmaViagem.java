
import java.util.Scanner;

public class Ex1CustoDeUmaViagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // entrada

        float distancia, consumoMedio, precoPorLitro;

        // saida

        float quantCombustivelEstimada, custoEstimado;

        // leitura

        System.out.println("Distancia em km que será percorrida: ");
        distancia = entrada.nextFloat();

        System.out.println("Comsumo médio do seu carro: ");
        consumoMedio = entrada.nextFloat();

        System.out.println("Preço por litro: ");
        precoPorLitro = entrada.nextFloat();

        quantCombustivelEstimada = distancia / consumoMedio;

        custoEstimado = quantCombustivelEstimada * precoPorLitro;

        System.out.println("Quantidade estimada de combustivel: " + quantCombustivelEstimada);
        System.out.println("Custo estimado: " + custoEstimado);

        entrada.close();

    }

}
