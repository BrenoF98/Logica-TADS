import java.util.Scanner;

public class Exerc8 {
    
    /* 
        8. Média ponderada
            Solicite ao usuário três notas. Considere os seguintes pesos:

            primeira nota: peso 2;
            segunda nota: peso 3;
            terceira nota: peso 5.
            Calcule e mostre a média ponderada.

            A fórmula é:

            media = (nota1 × 2 + nota2 × 3 + nota3 × 5) ÷ 10
    */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        System.out.println("Média ponderada das notas: " + media);
        scanner.close();
        
    }
}
