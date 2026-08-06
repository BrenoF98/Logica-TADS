
import java.util.Scanner;

public class Exerc13 {
    /* 13. Área e perímetro de um retângulo
        Solicite ao usuário a largura e a altura de um retângulo. Calcule e mostre:

        a área;
        o perímetro.
        Fórmulas:

        area = largura × altura
        perimetro = 2 × largura + 2 × altura */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double largura, altura, area, perimetro;
        System.out.print("Digite a largura do retângulo: ");
        largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        altura = scanner.nextDouble();
        area = largura * altura;
        perimetro = 2 * largura + 2 * altura;

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);

        scanner.close();
 
    }
}