import java.util.Scanner;

public class Exerc14{

    /* 14. Área de um triângulo
        Solicite ao usuário a base e a altura de um triângulo. Calcule e mostre sua área.

        Fórmula:

        area = base × altura ÷ 2 */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double base, altura, area;
        

        System.out.print("Digite a base do triangulo: ");
        base = scanner.nextDouble();

        System.out.print("Digite a altura do triangulo: ");
        altura = scanner.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A área do triangulo é: " + area);

        scanner.close();

    }
}